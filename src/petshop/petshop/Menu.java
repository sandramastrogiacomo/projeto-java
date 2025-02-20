package petshop.petshop;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PET SHOP AU AU MIAU MIAU               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar produto.                       ");
			System.out.println("            2 - Listar todos os produtos.            ");
			System.out.println("            3 - Buscar produto.                      ");
			System.out.println("            4 - Atualizar descrição do produto.      ");
			System.out.println("            5 - Excluir produto.                     ");
			System.out.println("            6 - Colocar produto no carrinho.         ");
			System.out.println("            7 - Retirar produto do carrinho.         ");
			System.out.println("            8 - Pagamento.                           ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println("\nAu Au Miau Miau - o shopping do seu pet!");
				sobre();
				leia.close();
				System.exit(0);
								
			}
			switch (opcao) {
			case 1:
				System.out.println("Criar produto.\n\n");

				break;
			case 2:
				System.out.println("Listar todos os produtos.\n\n");

				break;
			case 3:
				System.out.println("Buscar produto.\n\n");

				break;
			case 4:
				System.out.println("Atualizar descrição do produto.\n\n");

				break;
			case 5:
				System.out.println("Excluir produto.\n\n");

				break;
			case 6:
				System.out.println("Colocar produto no carrinho.\n\n");

				break;
			case 7:
				System.out.println("Excluir produto do carrinho.\n\n");

				break;
			case 8:
				System.out.println("Pagamento.\n\n");

				break;
			default:
				System.out.println("\nOpção inválida!\n");
				break;
		}
	}
}
		
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Sandra Maastrogiacomo ");
		System.out.println("E-mail: sandramastrogiacomo@hotmail.com");
		System.out.println("github.com/sandramastrogiacomo");
		System.out.println("*********************************************************");
	}

	}


