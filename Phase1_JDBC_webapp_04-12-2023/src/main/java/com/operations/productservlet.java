package com.operations;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.webapp.db.DatabaseConnection2;

@WebServlet("/product")
public class productservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("ID"));

        try (Connection connection = DatabaseConnection2.getConnection()) {
            String sql = "SELECT * FROM eproducts WHERE ID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, ID);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    PrintWriter out = response.getWriter();
                    if (resultSet.next()) {
                        String name = resultSet.getString("name");
                        double price = resultSet.getDouble("price");
                        Date date_added=resultSet.getDate("Date_added");
                        
                        out.println("<html><body>");
                        out.println("<h2>Product Details:</h2>");
                        out.println("<p>Product ID: " + ID + "</p>");
                        out.println("<p>Product Name: " + name + "</p>");
                        out.println("<p>Price: " + price + "</p>");
                        out.println("<p>Date added: " + date_added + "</p>");
                        out.println("</body></html>");
                    } else {
                        out.println("<html><body>");
                        out.println("<h2>Error:</h2>");
                        out.println("<p>Product not found for this ID</p>");
                        out.println("</body></html>");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Database error", e);
        }
    }
}
