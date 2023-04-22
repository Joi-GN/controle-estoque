package model;

public class Produto {
	private int idProduto;
	private String nome;
	private String descricao;
	private int estoque;
	private double preco;

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
		
	}
	
}
