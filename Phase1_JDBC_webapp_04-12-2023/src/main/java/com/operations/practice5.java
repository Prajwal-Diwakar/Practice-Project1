package com.operations;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.webapp.db.DatabaseConnection3;

/**
* Servlet implementation class ProductDetails for the insert, delete and update operations
*/
@WebServlet("/IUDelete")
public class practice5 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public practice5() {
        super();
        // to do a  Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // to do a  Auto-generated constructor stub
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        props.load(in);
                        
                        
                        DatabaseConnection3 conn = new DatabaseConnection3(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                        Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Redmi', 17800.00, now())");
                        out.println("Executed an insert operation<br>");
                        
                        stmt.executeUpdate("update eproduct set price=2000 where name = 'Redmi'");
                        out.println("Executed an update operation<br>");
                        
                        stmt.executeUpdate("delete from eproduct where name = 'Redmi'");
                        out.println("Executed a delete operation<br>");
                        
                        stmt.close();
                        
                        conn.closeConnection();
                        
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
