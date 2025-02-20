package petshop.petshop;

import java.util.Scanner;
import petshop.petshop.model.PetShop;
import petshop.petshop.model.Cachorro;
import petshop.petshop.model.Gato;
import petshop.petshop.util.Cores; 



public class Menu {

	public static void main(String[] args) {
		
		Cachorro pc1 = new Cachorro (1, "Ração Seca", 70.0f);
		pc1.visualizar(); 
		
		Gato pg2 = new Gato (2, "Ração úmida", 6.5f);
		pg2.visualizar();
				  
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PET SHOP AU AU MIAU MIAU             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar um novo produto.               ");
			System.out.println("            2 - Listar todos os produtos.            ");
			System.out.println("            3 - Buscar um produto por ID ou nome.    ");
			System.out.println("            4 - Atualizar descrição de um produto.   ");
			System.out.println("            5 - Excluir um produto.                  ");
			System.out.println("            6 - Sair.                                ");
		    System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			if (opcao == 6) {
				System.out.println(Cores.TEXT_GREEN_BOLD + "\nAu Au Miau Miau - o shopping do seu pet!");
				sobre();
				leia.close();
				System.exit(0);
								
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_GREEN + "Criar um novo produto.\n\n");
				

				break;
			case 2:
				System.out.println(Cores.TEXT_GREEN + "Listar todos os produtos.\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_GREEN + "Buscar um produto por ID ou nome.\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_GREEN + "Atualizar descrição de um produto.\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_GREEN + "Excluir um produto.\n\n");

				break;
			
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n");
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


