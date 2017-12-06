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

import br.av.model.QuartaFinal;
import br.av.persistence.JogoDao;
import br.av.persistence.JogoDaoImpl;

/**
 * Servlet implementation class SortearGruposController
 */

@WebServlet("/QuartasDeFinalController")
public class QuartasDeFinalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JogoDao iDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuartasDeFinalController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		iDao = new JogoDaoImpl();

		List<QuartaFinal> listA = new ArrayList<QuartaFinal>();
		try {
			listA = iDao.quartasDeFinal();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("QuartasDeFinais", listA);

		RequestDispatcher rd = request.getRequestDispatcher("./QuartasDeFinais.jsp");
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
