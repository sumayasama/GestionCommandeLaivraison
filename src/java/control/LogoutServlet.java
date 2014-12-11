/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sumaya
 */
public class LogoutServlet extends HttpServlet {

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
      
//********************** log out(clean something) **********************//
        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", new java.util.Date().toString());//http://www.coderanch.com/t/541412/Servlets/java/Logout-servlet-button
        //response.setHeader("Expires", "0")//http://www.coderanch.com/t/541412/Servlets/java/Logout-servlet-button
        response.setHeader("Connection", "close");//http://javaarm.com/faces/display.xhtml?tid=2416&page=1#post_18198
        //
        if(request.getSession(false)!=null){
            request.getSession(false).invalidate();//remove session.
        }
        if(request.getSession()!=null){
            request.getSession().invalidate();//remove session.
        }
     
        request.logout();//JAAS log out (from servlet specification)! It is a MUST!
          
         
     
                //********************** redirect **********************//
        /**
         * Here, if we redirect response to a secured page (example:request.getContextPath()+"/faces/console/console.xhtml"),
         * then
         * (a)<auth-method>BASIC</auth-method> will redirect secured page to login page and login automatically with username and password that are cached in web browser.
         * (b)<auth-method>FORM</auth-method> will redirect secured page to login page too, but will NOT login automatically with username and password that are cached in web browser.
         *
         * Here, if we redirect response to a non-secured page, then the non-secured page is displayed (normal case).
         */
        response.sendRedirect(request.getContextPath());
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
