/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author adminsyss
 */
public class LoginCheck extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String uName = request.getParameter("uName");
            String pass = request.getParameter("pass");
            
            
            ServletContext context = getServletContext();
            ServletConfig config = getServletConfig();
            
            String contextval = context.getInitParameter("pass");
            String configval = config.getInitParameter("uName");
            
            Cookie ck = new Cookie("AJT_pract", "hitarth,doctor");
            
            HttpSession session = request.getSession();
            
            session.setAttribute("uName", uName);
            session.setAttribute("pass", pass);
            
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet LoginCheck</title>");  
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet LoginCheck at " + configval + contextval + "</h1>");
//                out.println("</body>");
//                out.println("</html>");
                
            if(session.getAttribute("pass").equals(context.getInitParameter("pass")) && session.getAttribute("uName").equals(config.getInitParameter("uName")))
            {
            
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet LoginCheck</title>");  
//                out.println("</head>");
//                out.println("<body>");
                out.println("<br> <h1>Servlet LoginCheck at " + session.getAttribute("uName") + "</h1>");
                
                out.println("<form method=\"post\" action=\"./Cookie_Catch\"/>");
                out.println("<input type=\"submit\"/>");
                
                out.println("</body>");
                out.println("</html>");
                
                response.addCookie(ck);
            }
            else
            {
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet LoginCheck</title>");  
//                out.println("</head>");
//                out.println("<body>");
                out.println("<br> <h1> Invalid Login </h1>");
                out.println("</body>");
                out.println("</html>");
            }
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
