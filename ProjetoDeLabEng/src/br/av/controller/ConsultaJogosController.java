package br.av.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.av.model.Jogo;
import br.av.persistence.GrupoDaoImpl;
import br.av.persistence.GrupoDao;
import br.av.persistence.JogoDao;
import br.av.persistence.JogoDaoImpl;

/**
 * Servlet implementation class SortearGruposController
 */

@WebServlet("/ConsultaJogosController")
public class ConsultaJogosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GrupoDao gDao;
	private JogoDao iDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultaJogosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		gDao = new GrupoDaoImpl();
		iDao = new JogoDaoImpl();

		List<Jogo> lista = new ArrayList<Jogo>();

		System.out.println("Estou aqui ");

		limpa();
		sortearGrupo();

		String txtData = request.getParameter("txtData");

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		java.sql.Date data = null;
		try {
			data = new java.sql.Date(format.parse(txtData).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			lista = iDao.buscarJogosPelaData(data);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		request.setAttribute("JOGOS", lista);

		RequestDispatcher rd = request.getRequestDispatcher("./ConsultarJogos.jsp");
		rd.forward(request, response);

	}

	public void limpa() {
		try {
			iDao.limparTabelas();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void limparJogos() {
		try {
			iDao.limparJogos();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void sortearGrupo() {
		try {
			gDao.sortearGrupos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
