/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.rands;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class ValidServ extends HttpServlet {

    private static long serialVersionUID = 1L;

    ServletConfig cfg;

    public ValidServ() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {
        cfg = config;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String un = request.getParameter("txtuser");
        String pw = request.getParameter("txtpass");
        boolean flag = false;
        Enumeration<String> initparams = cfg.getInitParameterNames();
        while (initparams.hasMoreElements()) {
            String name = initparams.nextElement();
            String pass = cfg.getInitParameter(name);

            if (un.equals(name) && pw.equals(pass)) {
                flag = true;
            }
        }
        if (flag) {
            response.getWriter().print("valid user");
        } else {
            response.getWriter().print("Invalid user");
        }
    }

}
