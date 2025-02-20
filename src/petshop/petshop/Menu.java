package petshop.petshop;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import petshop.petshop.controller.PetShopController;
import petshop.petshop.model.Cachorro;
import petshop.petshop.model.Gato;
import petshop.petshop.util.Cores;

public class Menu {

	public static void main(String[] args) {

		PetShopController petshop = new PetShopController();

		Scanner leia = new Scanner(System.in);

		int opcao, tipo;
		String nome;
		float valor;

		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite somente números inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println(Cores.TEXT_GREEN_BOLD + "\nAu Au Miau Miau - o shopping do seu pet!");
				sobre();
				leia.close();
				System.exit(0);

			}
			int numero;
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_GREEN + "Criar um novo produto.\n\n");

				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("Digite o valor do produto: ");
				leia.skip("\\R?");
				valor = leia.nextFloat();

				do {
					System.out.println("Digite o tipo de animal ( 1-Cachorro ou 2-Gato)");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {

					petshop.cadastrar(new Cachorro(tipo, nome, valor, petshop.gerarNumero()));
				}
				case 2 -> {

					petshop.cadastrar(new Gato(tipo, nome, valor, petshop.gerarNumero()));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_GREEN + "Listar todos os produtos.\n\n");
				petshop.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_GREEN + "Buscar um produto por ID ou nome.\n\n");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				petshop.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_GREEN + "Atualizar descrição de um produto.\n\n");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				var buscaPetShop = petshop.buscarNaCollection(numero);

				if (buscaPetShop != null) {

					tipo = buscaPetShop.getTipo();

					System.out.println("Digite o nome do produto:  ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Digite o valor do produto: ");
					valor = leia.nextFloat();

					switch (tipo) {
					case 1 -> {

						petshop.atualizar(new Cachorro(tipo, nome, valor, numero));
					}
					case 2 -> {

						petshop.atualizar(new Gato(tipo, nome, valor, numero));
					}

					}

				}
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_GREEN + "Excluir um produto.\n\n");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				petshop.deletar(numero);

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n");

				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
