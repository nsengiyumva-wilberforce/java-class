/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.university;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

/**
 *
 * @author USER
 */
public class Form1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Profile Info</title>");            
            out.println("</head>");
            out.println("<body>");
           
            //String f = (String)request.getParameter("firstname");
            //out.println("The first name is: "+f);
            
             //HttpSession s = request.getSession();
            
            //s.setAttribute("fname", f);
            //s.setAttribute("village", request.getParameter("village"));
            //out.println("Go to <a href='Form2'>Form2</a>");
            
            //String u = request.getParameter("username");
            //String p = request.getParameter("password");
            
            //if(u.equals("wilber") && p.equals("123")){
                //RequestDispatcher re = request.getRequestDispatcher("/Form2");
                //HttpSession s = request.getSession();
                //s.setAttribute("username", u);
                //re.forward(request, response);
            //} else {
                //request.setAttribute("error", "Wrong useername or password");
              //RequestDispatcher re = request.getRequestDispatcher("/"); 
              //re.forward(request, response);
            //}
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                try{
                Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/mynewdatabase","root","wilber4c");
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from counselor");
                //out.println("It worked though");
                //stmt.executeUpdate("insert into counselor set id='10', firstName='Love', nickName='darl', lastName='sweet', telephone='09999999', email='nanan@gmail.com', memberSince='111111'");
                while(rs.next()){
                   out.println("<font color='red'>"+rs.getInt(1)+"</font> "+rs.getString(2)+"<br>");   
                }  
                } catch(SQLException s){
                    out.println("The error is "+s.getMessage());
                }
            }
            catch(ClassNotFoundException e){
                out.println("The error is "+e.getMessage());
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
