package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.util.Cores;
import ecommerce.model.Produtos;
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
			System.out.println(Cores.TEXT_PURPLE_BOLD + "                LIVRARIA DA CIDADE	             ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE + "            1 - Localizar produto             	     ");
			System.out.println(Cores.TEXT_PURPLE + "            2 - Cadastrar novo produto                 ");
			System.out.println(Cores.TEXT_PURPLE + "            3 - Listar produtos          	 ");
			System.out.println(Cores.TEXT_PURPLE + "            4 - Deletar produto      		 ");
			System.out.println(Cores.TEXT_PURPLE + "            5 - Sair                       		     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE + "Digite a opção desejada:                    		     ");
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
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Digite o código do produto\n\n");
				int codigo = leia.nextInt();

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Informe os dados solicitados\n\n");

				keyPress();
				break;
			
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Lista de produtos\n\n");
				produtos.listarProdutos();
				keyPress();
				break;
			
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "Deletar produto do sistema\n\n");

				keyPress();
				break;
			
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\"Agradecemos o seu acesso!\n\n\"");

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