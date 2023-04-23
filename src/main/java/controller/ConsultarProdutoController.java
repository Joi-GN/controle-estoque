package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Produto;

/**
 * Servlet implementation class ConsultarProdutoController
 */
public class ConsultarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ConsultarProdutoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		List<Produto> produtos = new Produto().searchProductByName(name);
		request.setAttribute("produtos", produtos);
		request.getRequestDispatcher("consultarProduto.jsp").forward(request, response);
	}

}
