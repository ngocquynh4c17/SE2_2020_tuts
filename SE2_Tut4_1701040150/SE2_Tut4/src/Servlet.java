

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import model.Acessories;
import model.Dress;
import model.Shirt;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the Shirt.
 */

@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DAO DAO;

	public void init() {
		DAO = new DAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listShirt(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listShirt(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Shirt> listShirt = DAO.selectAllShirts();
		request.setAttribute("listShirt", listShirt);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Cloth_shop.jsp");
		dispatcher.forward(request, response);
	}
	
	@SuppressWarnings("unused")
	private void listDress(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Dress> listDress = DAO.selectAllDreses();
		request.setAttribute("listDress", listDress);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Cloth_shop.jsp");
		dispatcher.forward(request, response);
	}
	
	@SuppressWarnings("unused")
	private void listAcess(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Acessories> listAcess = DAO.selectAllAcessories();
		request.setAttribute("listAcess", listAcess);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Cloth_shop.jsp");
		dispatcher.forward(request, response);
	}
}
