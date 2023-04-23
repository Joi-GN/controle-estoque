package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Produto;

public class ProdutoDAO {

	public void save(Produto produto) {

		String sql = "INSERT INTO produtos (name, description, stock, price) VALUES (?, ?, ?, ?)";
		try(Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
				stm.setString(1, produto.getNome());
				stm.setString(2, produto.getDescricao());
				stm.setInt(3, produto.getEstoque());
				stm.setDouble(4, produto.getPreco());
				stm.execute();			
				
		} catch(Exception e) {
			throw new RuntimeException("Houve um erro ao cadastrar o produto: " + e.getMessage());
		}
	}
	
	public List<Produto> searchProductByName(String name) {
		List<Produto> produtos = new ArrayList<>();
		
		String sql = "SELECT * FROM produtos WHERE name LIKE '%" + name + "%'";
		try(Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement stm = conn.prepareStatement(sql);
						ResultSet rs = stm.executeQuery()) {
			
			while(rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt("id"));
				produto.setNome(rs.getString("name"));
				produto.setDescricao(rs.getString("description"));
				produto.setEstoque(rs.getInt("stock"));
				produto.setPreco(rs.getDouble("price"));
				produtos.add(produto);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Houve um erro ao procurar o produto no banco de dados: " + e.getMessage());
		}
		
		return produtos;
	}
}