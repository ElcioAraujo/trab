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

import br.av.model.Grupo;
import br.av.persistence.GrupoDaoImpl;
import br.av.persistence.GrupoDao;

/**
 * Servlet implementation class SortearGruposController
 */

@WebServlet("/ClassificacaoDeGrupoController")
public class ClassicacaoDeGrupoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GrupoDao gDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClassicacaoDeGrupoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		gDao = new GrupoDaoImpl();

		List<Grupo> listA = new ArrayList<Grupo>();
		try {
			listA = gDao.grupoA();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listB = new ArrayList<Grupo>();
		try {
			listB = gDao.grupoB();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listC = new ArrayList<Grupo>();
		try {
			listC = gDao.grupoC();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Grupo> listD = new ArrayList<Grupo>();
		try {
			listD = gDao.grupoD();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("GrupoA", listA);
		request.setAttribute("GrupoB", listB);
		request.setAttribute("GrupoC", listC);
		request.setAttribute("GrupoD", listD);

		RequestDispatcher rd = request.getRequestDispatcher("./ClassicacaoDeGrupo.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
