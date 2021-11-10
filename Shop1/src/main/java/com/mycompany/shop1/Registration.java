/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.shop1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class Registration extends HttpServlet {

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
            out.println("<title>Servlet Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1Registration Form</h1>");
            String form = "<form method=\"POST\" action=\"Saveuser\">\n" +
"        <table>\n" +
"            <tbody>\n" +
"                <tr>\n" +
"                    <td>First Name</td>\n" +
"                    <td><input type=\"text\" name=\"fName\" /></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td>Last Name</td>\n" +
"                    <td><input type=\"text\" name=\"lName\" /></td>\n" +
"                </tr>\n" +
"                    <tr>\n" +
"                    <td>Phone Number</td>\n" +
"                    <td><input type=\"text\" name=\"phone\" /></td>\n" +
"                </tr>\n" +
"                 <tr>\n" +
"                    <td>Username</td>\n" +
"                    <td><input type=\"text\" name=\"username\" /></td>\n" +
"                </tr>\n" +
"                    <tr>\n" +
"                    <td>Password</td>\n" +
"                    <td><input type=\"password\" name=\"pass\" /></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td></td>\n" +
"                    <td><input type=\"submit\" value=\"Login\" name=\"submit\" /></td>\n" +
"                </tr>\n" +
"            </tbody>\n" +
"        </table>\n" +
"            </form>";
            out.println(form);
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
