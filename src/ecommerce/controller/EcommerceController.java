package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produtos;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	void String() {
	}
	
	@Override
	public void procurarPorCodigo(int codigo) {
		
	}

	@Override
	public void listarProdutos() {
		for (var Produtos : listaProdutos);
		Produtos produtos = dadosProduto;
		produtos.visualizar();	
	}

	@Override
	public void cadastrar(Produtos tipo) {
		
	}

	@Override
	public void atualizar(Produtos tipo) {
		
	}

	@Override
	public void deletar(int codigo) {
		
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
