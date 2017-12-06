package br.av.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.av.persistence.JogoDao;
import br.av.persistence.JogoDaoImpl;

/**
 * Servlet implementation class AlterarPlacarController
 */
@WebServlet("/AlterarPlacarController")
public class AlterarPlacarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarPlacarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String timeCasa = request.getParameter("txtTimeCasa1");
         String timeVisitante = request.getParameter("txtTimeVisitante1");
         
		JogoDao iDao = new JogoDaoImpl();
		
	}

}
