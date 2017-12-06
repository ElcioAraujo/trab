package br.av.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.av.model.Grupo;
import br.av.persistence.GrupoDaoImpl;
import br.av.persistence.GrupoDao;
import br.av.persistence.JogoDao;
import br.av.persistence.JogoDaoImpl;

/**
 * Servlet implementation class SortearGruposController
 */

@WebServlet("/SortearGruposController")
public class SortearGruposController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GrupoDao gDao;
	private JogoDao iDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SortearGruposController() {
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

		System.out.println("Estou aqui ");

		limpa();
		sortearGrupo();

		List<Grupo> listA = new ArrayList<Grupo>();
		try {
			listA = gDao.sorteiaGruposA();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listB = new ArrayList<Grupo>();
		try {
			listB = gDao.sorteiaGruposB();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listC = new ArrayList<Grupo>();
		try {
			listC = gDao.sorteiaGruposC();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listD = new ArrayList<Grupo>();
		try {
			listD = gDao.sorteiaGruposD();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("GrupoA", listA);
		request.setAttribute("GrupoB", listB);
		request.setAttribute("GrupoC", listC);
		request.setAttribute("GrupoD", listD);

		RequestDispatcher rd = request.getRequestDispatcher("./SortearGrupos.jsp");
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
