package fr.imie.ProjetPlateformeWeb.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.ProjetPlateformeWeb.dao.UserDAO;
import fr.imie.ProjetPlateformeWeb.entity.User;
import fr.imie.ProjetPlateformeWeb.form.Subscriptionform;


/**
 * Servlet implementation class Subscription
 */
@WebServlet("/inscription")
public class Subscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VIEW_SUBSCRIPTION = "/WEB-INF/subscription.jsp";
	
	private static final String ATT_FORM = "form";
	private static final String ATT_USER = "user";

	@EJB
	private UserDAO userDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(Subscription.VIEW_SUBSCRIPTION).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Subscriptionform form = new Subscriptionform(this.userDAO);
		
		User u1 = form.createUser(request);
		
		User user = this.userDAO.get(0);
		
		request.setAttribute(Subscription.ATT_FORM, form);
		request.setAttribute(Subscription.ATT_USER, user);
		
		this.getServletContext().getRequestDispatcher(Subscription.VIEW_SUBSCRIPTION).forward(request, response);
	}

	
}
