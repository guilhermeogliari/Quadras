/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Usuario;

/**
 *
 * @author fcolchete
 */
@WebServlet("/EditarUser")
public class EditarUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		long cpf = Long.parseLong(request.getParameter("cpf"));
		int idade = Integer.parseInt(request.getParameter("idade"));
		int pontos = Integer.parseInt(request.getParameter("pontos"));
		String senha = request.getParameter("senha");

		Usuario usuario = new Usuario(id, nome, cpf, idade, pontos, senha);

		try {

			UsuarioController usuarioController = new UsuarioController();
			usuarioController.alterar(usuario);

			request.getRequestDispatcher("principal.jsp").forward(request, response);

		} catch (Exception ex) {
			System.out.println("caindo na excecao do Editar!!!");
			request.getSession().setAttribute("login", "null");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
