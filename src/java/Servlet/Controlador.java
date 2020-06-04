package Servlet;

import Modelo.ProfesorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {
    String index = "index.jsp";
    String add = "add.jsp";
    String edit = "edit.jsp";
    String find = "find.jsp";
    String acceso = "";
    ProfesorService user = new ProfesorService();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        if(accion.equals("index")){
            acceso = index;
        }else if(accion.equals("add")){
            acceso = add;
  // public Profesor(int IdProfesor, String Nombres, String Apellidos, int Edad, int Dni, char Genero)
        }else if(accion.equals("Guardar")){
            String Nombres = request.getParameter("txtNom");
            String Apellidos = request.getParameter("txtApe");
            int Edad = Integer.parseInt(request.getParameter("txtEdad"));
            int Dni = Integer.parseInt(request.getParameter("txtDni"));
            String Genero = request.getParameter("txtGenero");
            
            user.agregar(Nombres,Apellidos,Edad,Dni,Genero);
            acceso = index;
        }
        else if(accion.equals("edit")){
            acceso = edit;
        }else if(accion.equals("del")){
            int id = Integer.parseInt(request.getParameter("id"));
            user.suprimir(id);
            acceso = index;
        }else if(accion.equals("find")){
            acceso = find;
        }
        RequestDispatcher navegacion = request.getRequestDispatcher(acceso);
        navegacion.forward(request, response);
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