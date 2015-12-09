/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fcolchete
 */
@WebServlet("/EditarUser")
public class EditarUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */




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
            
            String nome = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        int id = Integer.parseInt(request.getParameter("id"));
        long cpf = Long.parseLong(request.getParameter("cpf"));
        int pontos = Integer.parseInt(request.getParameter("pontos"));
        int idade = Integer.parseInt(request.getParameter("idade"));

        Usuario usuario = new Usuario(id, nome, cpf, idade, pontos, senha);

        try {

            UsuarioController usuarioController = new UsuarioController();

            usuarioController.alterar(usuario);
            request.getSession().setAttribute("login", usuario.getNome());
            request.getRequestDispatcher("principal.jsp").forward(request, response);

        } catch (Exception ex) {
            System.out.println("caindo na excecao do Editar!!!");
            request.getSession().setAttribute("login", "null");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
            
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
                
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
