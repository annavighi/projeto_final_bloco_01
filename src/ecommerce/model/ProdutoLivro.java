package ecommerce.model;

public class ProdutoLivro extends Produtos {

	public ProdutoLivro(int codigoProduto, int tipoProduto, String dadosProduto, float preco, int qtdEstoque) {
		super(codigoProduto, tipoProduto, dadosProduto, preco, qtdEstoque);
	}

	@Override
	public void visualizar() {
		System.out.println("Produto Livro: " + getDadosProduto() + ", Código: " + getCodigoProduto() + ", Preço: "
				+ getPreco() + ", Estoque: " + getQtdEstoque());
	}
}
