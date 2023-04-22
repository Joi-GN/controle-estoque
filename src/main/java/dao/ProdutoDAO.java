package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Produto;

public class ProdutoDAO {

	public void save(Produto produto) {
//		CONNECT TO DATABASE
		String user = "user01";
		String pw = "user0101";
		String url = "jdbc:mysql://localhost:3306/controle_estoque";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection(url, user, pw)) {
//				SAVE PRODUCT TO DATABASE
				String sql = "INSERT INTO produtos (name, description, stock, price) VALUES (?, ?, ?, ?)";
				try (PreparedStatement stm = connection.prepareStatement(sql)) {
					stm.setString(1, produto.getNome());
					stm.setString(2, produto.getDescricao());
					stm.setInt(3, produto.getEstoque());
					stm.setDouble(4, produto.getPreco());
					stm.execute();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Houve um erro ao cadastrar o produto: " + e.getMessage());
		}
	}
}
