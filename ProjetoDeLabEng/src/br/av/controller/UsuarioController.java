package br.av.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.av.model.Usuario;
import br.av.model.UsuarioPadrao;
import br.av.persistence.UsuarioDao;
import br.av.persistence.UsuarioDaoImpl;

/**
 * Servlet implementation class UsuarioController
 */

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuarioController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String btnEntrar = request.getParameter("entrar");
		String btnAlterar = request.getParameter("btnAlterar");
		String btnSalvar = request.getParameter("btnSalvar");

		if ("Entrar".equalsIgnoreCase(btnEntrar)) {

			String usuario = request.getParameter("txtUsuario");
			String senha = request.getParameter("txtSenha");

			if (usuario.equals("") || senha.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("./LoginErro.jsp");
				rd.forward(request, response);
			} else {
				UsuarioDao uDao = new UsuarioDaoImpl();

				try {
					UsuarioPadrao up = uDao.autenticaUsuarioPadrao(usuario);
					Usuario u = uDao.autenticaUsuario(usuario);

					if (up != null) {
				
						if (up.getUsuario().equals(usuario) && up.getSenha().equals(senha)) {
							request.getSession().setAttribute("USUARIOPADRAO", up);
							RequestDispatcher rd = request.getRequestDispatcher("./primeiroAcesso.jsp");
							rd.forward(request, response);
						} else {
							RequestDispatcher rd = request.getRequestDispatcher("./LoginErro.jsp");
							rd.forward(request, response);
						}
					} else if (u != null){
						
							if (u.getUsuario().equals(usuario) && u.getSenha().equals(senha)) {
								request.getSession().setAttribute("USUARIO", u.getUsuario());
								RequestDispatcher rd = request.getRequestDispatcher("./Menu.jsp");
								rd.forward(request, response);
							} else {
								RequestDispatcher rd = request.getRequestDispatcher("./LoginErro.jsp");
								rd.forward(request, response);
							}
					} else {
						RequestDispatcher rd = request.getRequestDispatcher("./LoginNaoExiste.jsp");
						rd.forward(request, response);
					}
					} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}

		if ("Alterar".equalsIgnoreCase(btnAlterar)) {
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
			Usuario u = new Usuario();
			u.setEmail(email);
			u.setSenha(senha);
			String usuario = request.getSession().getAttribute("USUARIO").toString();
			u.setUsuario(usuario);

			UsuarioDao uDao = new UsuarioDaoImpl();
			try {
				uDao.alteraUsuario(u);
				RequestDispatcher rd = request.getRequestDispatcher("./configuracaoAlterar.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if ("Salvar".equalsIgnoreCase(btnSalvar)) {

			UsuarioDao uDao = new UsuarioDaoImpl();
			try {
				Usuario u = new Usuario();
				u.setUsuario(request.getParameter("txtLogin"));
				u.setEmail(request.getParameter("txtEmail"));
				u.setSenha(request.getParameter("txtSenha"));
				uDao.insereUsuario(u);
			} catch (SQLException e) {
				e.printStackTrace();
			}

			RequestDispatcher rd = request.getRequestDispatcher("./Login.jsp");
			rd.forward(request, response);

		}
	}

}
