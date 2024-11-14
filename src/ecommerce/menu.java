package ecommerce;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		
		while (true) {

			
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                LIVRARIA DA CIDADE	                ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("            1 - Acessar minha conta                          ");
			System.out.println("            2 - Criar uma nova conta               ");
			System.out.println("            3 - Esqueci minha senha              ");
			System.out.println("            4 - Meus pedidos             ");
			System.out.println("            5 - Carrinho                         ");
			System.out.println("            6 - Lista de desejo                                ");
			System.out.println("            7 - Sair                            ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("Digite a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nA Livraria da Cidade agradece a sua visita!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Digite seu e-mail:\n\n");
					String email = leia.nextLine();
					
					System.out.println("Digite sua senha:\n\n");
					String senha = leia.nextLine();
					break;
				case 2:
					System.out.println("Informe os dados solicitados:\n\n");

					break;
				case 3:
					System.out.println("Informe o seu endereço de e-mail abaixo.\nSe o cadastro for localizado, enviaremos para o seu e-mail um link para criar uma nova senha.\n\n");

					break;
				case 4:
					System.out.println("Lista de pedidos atualizada:\n\n");

					break;
				case 5:
					System.out.println("Carrinho\n\n");

					break;
				case 6:
					System.out.println("Sua lista de desejos\n\n");

					break;
				case 7:
					System.out.println("Agradecemos o seu acesso, nos vemos em breve!\n\n");

					break;
				default:
					System.out.println("\nDesculpe, parece que essa não é uma opção válida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n                                                     ");
		System.out.println("Projeto Desenvolvido por: Anna Vighi");
		System.out.println("Generation Brasil - vighianna@gmail.com");
		System.out.println("https://github.com/annavighi/");
		System.out.println("                                                     ");
	}
}