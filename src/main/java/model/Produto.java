package model;

import java.util.List;

import dao.ProdutoDAO;

public class Produto {
	private int idProduto;
	private String nome;
	private String descricao;
	private int estoque;
	private double preco;
	
	public Produto(){}

	public Produto(int idProduto, String nome, String descricao, int estoque, double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.estoque = estoque;
		this.preco = preco;
	}

	public Produto(String nome, String descricao, int estoque, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.estoque = estoque;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome() {
		return nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void save() {
		new ProdutoDAO().save(this);
	}
	
	public List<Produto> searchProductByName(String name) {
		return new ProdutoDAO().searchProductByName(name);
	}
	
}
