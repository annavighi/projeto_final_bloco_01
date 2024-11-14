package ecommerce;

import java.io.IOException;
import java.util.Scanner;
import ecommerce.util.Cores;
import ecommerce.controller.EcommerceController;
import ecommerce.model.ProdutoLivro;
import ecommerce.model.ProdutoPapelaria;

public class menu {
	
	public static void main(String[] args) {
		
		EcommerceController produtos = new EcommerceController();
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "                LIVRARIA DA CIDADE	             ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "            1 - Localizar produto             	     ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "            2 - Cadastrar novo produto                 ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "            3 - Listar produtos          	 ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "            4 - Deletar produto      		 ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "            5 - Sair                       		     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Digite a opção desejada:                    		     ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nA Livraria da Cidade agradece a visita!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Digite o código do produto\n\n");
				int codigo = leia.nextInt();
				keyPress();
				break;

			case 2:
				System.out.print(Cores.TEXT_PURPLE_BOLD_BRIGHT + "CADASTRO DE NOVO PRODUTO");
				System.out.print("\nInforme o tipo do produto (1-Livro, 2-Papelaria): ");
				int tipo = leia.nextInt();
				System.out.print("\nInforme o código do produto: ");
				int codigoNovo = leia.nextInt();
				leia.nextLine();
				System.out.print("\nDigite o nome do produto:\n(Para papelaria escreva, por exemplo, 'Caneta esferógráfica - Marca X', para livros, informe o título da obra)\n");
				String dados = leia.nextLine();
				System.out.print("\nInforme o preço do produto: ");
				float preco = leia.nextFloat();
				System.out.print("\nInforme a quantidade em estoque: ");
				int qtdEstoque = leia.nextInt();

				if (tipo == 1) {
					produtos.cadastrar(new ProdutoLivro(codigoNovo, tipo, dados, preco, qtdEstoque));
				} else {
					produtos.cadastrar(new ProdutoPapelaria(codigoNovo, tipo, dados, preco, qtdEstoque));
				}
				keyPress();
				break;
			
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Lista de produtos\n\n");
				produtos.listarProdutos();
				keyPress();
				break;
			
			case 4:
				System.out.print(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nPara deletar um produto do estoque, digite o código do produto: ");
				int codigoDel = leia.nextInt();
				produtos.deletar(codigoDel);
				keyPress();
				break;
			
			default:
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nDesculpe, parece que essa não é uma opção válida!\n");

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_PURPLE + "\n                                                     ");
		System.out.println(Cores.TEXT_PURPLE + "Projeto Desenvolvido por: Anna Vighi");
		System.out.println(Cores.TEXT_PURPLE + "Generation Brasil - vighianna@gmail.com");
		System.out.println(Cores.TEXT_PURPLE + "https://github.com/annavighi/");
		System.out.println(Cores.TEXT_PURPLE + "                                                     ");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}