/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poxmania.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import poxmania.model.Producto;

@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        LibreriaDAO dao = new LibreriaDAO();

        PrintWriter out = response.getWriter();
        try {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Listado de Libros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de Libros</h1><br/>");


                List <Producto> listadoProductos = dao.getTodosProductos();
            out.println("hola");
                for (Producto prod : listadoProductos){
                    out.println("<p>" + prod.getNombreproducto() + "</p>");
                }

            out.println("<br/>");
            out.println("<a href='ServletLibreria'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
            dao.close();
        }
    }



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
