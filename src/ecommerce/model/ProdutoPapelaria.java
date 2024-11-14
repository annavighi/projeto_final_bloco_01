package ecommerce.model;

public class ProdutoPapelaria extends Produtos {

	public ProdutoPapelaria(int codigoProduto, int tipoProduto, String dadosProduto, float preco, int qtdEstoque) {
		super(codigoProduto, tipoProduto, dadosProduto, preco, qtdEstoque);
	}

	@Override
	public void visualizar() {
		System.out.println("Produto Papelaria: " + getDadosProduto() + ", Código: " + getCodigoProduto() + ", Preço: "
				+ getPreco() + ", Estoque: " + getQtdEstoque());
	}
}
