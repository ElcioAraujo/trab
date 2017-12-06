package br.av.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.av.persistence.JogoDao;
import br.av.persistence.JogoDaoImpl;

/**
 * Servlet implementation class SortearGruposController
 */

@WebServlet("/SortearJogosController")
public class SortearJogosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JogoDao iDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SortearJogosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		iDao = new JogoDaoImpl();

		System.out.println("Estou aqui ");

		limparJogos();
		sorteioDeJogos();
		request.setAttribute("Mensagem", "Jogos Sorteados com Sucesso");


		RequestDispatcher rd = request.getRequestDispatcher("./Menu.jsp");
		rd.forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


	public void sorteioDeJogos() {
		try {
			iDao.sorteiaJogos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public void limparJogos(){
		try {
			iDao.limparJogos();
		} catch (SQLException e) {
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, e.getMessage() ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
		}


	}

}
