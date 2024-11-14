package ecommerce.model;

public abstract class Produtos {

	private int codigoProduto;
	private int tipoProduto;
	private String dadosProduto;
	private float preco;
	private int qtdEstoque;

	public Produtos(int codigoProduto, int tipoProduto, String dadosProduto, float preco, int qtdEstoque) {
		this.codigoProduto = codigoProduto;
		this.tipoProduto = tipoProduto;
		this.dadosProduto = dadosProduto;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDadosProduto() {
		return dadosProduto;
	}

	public void setDadosProduto(String dadosProduto) {
		this.dadosProduto = dadosProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public abstract void visualizar();

}
