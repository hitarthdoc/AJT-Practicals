/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nandish
 */
public class Cookie_Catch extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            ServletContext context = getServletContext();
            ServletConfig config = getServletConfig();
            
            String contextval = context.getInitParameter("pass");
            String configval = config.getInitParameter("uName");
            
            Cookie[] cks = null;
            Cookie ck = null;
            int i;
            
            cks = request.getCookies();
            
            HttpSession session = request.getSession();
                
            
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet LoginCheck</title>");  
                out.println("</head>");
                out.println("<body>");
             
            request.getParameter("Persistent");
            out.println("<h1>" + request.getParameter("Persistent") + "</h1>");
            
            
            for(i=0; i<cks.length; i++)
            {   
                ck = cks[i];
                out.println("<p> " + ck.getName() + "&nbsp  " + ck.getValue() + " </p>");
                if(request.getParameter("Persistent").equals("on"))
                {
                ck.setMaxAge(60*60*24);
                }
                response.addCookie(ck);
            }
            
//                out.println("<h1>Servlet LoginCheck at " + configval + contextval + "</h1>");
                out.println("</body>");
                out.println("</html>");
                
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
