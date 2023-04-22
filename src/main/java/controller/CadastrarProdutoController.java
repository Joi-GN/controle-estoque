package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Produto;

import java.io.IOException;

public class CadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarProdutoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
//		GET PARAMETERS
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int stock;
		double price;
		
		String message;

//		FORM INPUT VALIDATION
		if(name != null && !name.isEmpty() && request.getParameter("stock") != null && request.getParameter("stock").isEmpty() 
				&& request.getParameter("price") != null && request.getParameter("price").isEmpty()) {
			stock = Integer.parseInt(request.getParameter("stock"));
			price = Double.parseDouble(request.getParameter("price"));
			
			new Produto(name, description, stock, price).save();
			
			message = "Produto cadastrado com sucesso";
		} else {
			message = "Preencha todos os campos obrigatórios";
		}
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("cadastrarProduto.jsp").forward(request, response);
	}

}
