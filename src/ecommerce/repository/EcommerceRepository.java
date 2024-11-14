package ecommerce.repository;

	import ecommerce.model.Produtos;

		public interface EcommerceRepository {

	// CRUD do Sistema
	public void procurarPorCodigo(int codigo);
	public void listarProdutos();
	public void cadastrar(Produtos tipo);
	public void atualizar(Produtos tipo);
	public void deletar(int codigo);

	// Métodos de Venda
	public void vender(int codigo, float valor);
	public void estocar(int codigo, float valor);

}
