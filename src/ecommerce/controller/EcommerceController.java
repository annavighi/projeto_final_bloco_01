package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.model.Produtos;
import ecommerce.repository.EcommerceRepository;
import ecommerce.util.Cores;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Produtos> listaProdutos = new ArrayList<>();

	@Override
	public void procurarPorCodigo(int codigo) {
		for (Produtos produto : listaProdutos) {
			if (produto.getCodigoProduto() == codigo) {
				produto.visualizar();
				return;
			}
		}
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nDesculpe, o produto informado não foi encontrado. :(");
	}

	@Override
	public void listarProdutos() {
		for (Produtos produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produtos produto) {
		listaProdutos.add(produto);
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nO produto foi cadastrado com sucesso! :D");

	}

	@Override
	public void atualizar(Produtos produto) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (listaProdutos.get(i).getCodigoProduto() == produto.getCodigoProduto()) {
				listaProdutos.set(i, produto);
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nO produto foi atualizado com sucesso! ;)");
				return;
			}
		}
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nDesculpe, o produto solicitado não foi encontrado para atualização.");

	}

	@Override
	public void deletar(int codigo) {
		listaProdutos.removeIf(produto -> produto.getCodigoProduto() == codigo);
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nO produto " + codigo + " foi excluído do estoque.");
	}

	@Override
	public void vender(int codigo, float valor) {

	}

	@Override
	public void estocar(int codigo, float valor) {

	}

	public ArrayList<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
