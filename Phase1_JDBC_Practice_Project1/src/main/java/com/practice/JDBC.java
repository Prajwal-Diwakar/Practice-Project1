package com.practice;



import com.connection.DatabaseConnection;
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


@WebServlet("/product")
public class productservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("productId"));

        try (Connection connection = DatabaseConnection2.getConnection()) {
            String sql = "SELECT * FROM eproduct WHERE ID = ?";
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
                        out.println("<p>ID: " + ID + "</p>");
                        out.println("<p>name: " + name + "</p>");
                        out.println("<p>Price" + price + "</p>");
                        out.println("<p>Date_added" + date_added+"</p>");
                        out.println("</body></html>");
                    } else {
                        out.println("<html><body>");
                        out.println("<h2>Error:</h2>");
                        out.println("<p>Product not found</p>");
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
