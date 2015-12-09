package Control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Usuario;

@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Autenticar() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		String nome = request.getParameter("usuario");
		String senha = request.getParameter("senha");
                
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);

		try {
						
			UsuarioController usuarioController = new UsuarioController();
			
			if(usuarioController.localizar(usuario)!= null){
				request.getSession().setAttribute("login", usuario.getNome());
				request.getRequestDispatcher("principal.jsp").forward(request, response);
			}
			
		} catch (Exception ex) {
			System.out.println("caindo na excecao!!!");
			request.getSession().setAttribute("login", "null");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
