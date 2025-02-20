package petshop.petshop.controller;

import java.util.ArrayList;

import petshop.petshop.model.PetShop;
import petshop.petshop.repository.PetShopRepository;

public class PetShopController implements PetShopRepository {

	private ArrayList<PetShop> listaProdutos = new ArrayList<PetShop>();
	int numero;

	@Override
	public void listarTodos() {
		for (var petshop : listaProdutos) {
			petshop.visualizar();

		}
	}

	@Override
	public void procurarPorNumero(int numero) {
		var petshop = buscarNaCollection(numero);

		if (petshop != null)
			petshop.visualizar();
		else
			System.out.println("\n O produto número: " + numero + " não foi encontrado!");

	}

	@Override
	public void cadastrar(PetShop petshop) {
		listaProdutos.add(petshop);
		System.out.println("\nO produto: " + petshop.getNome() + " foi criado com sucesso!");

	}

	@Override
	public void atualizar(PetShop petshop) {
		var buscaPetShop = buscarNaCollection(petshop.getID());

		if (buscaPetShop != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaPetShop), petshop);
			System.out.println("\nO produto número: " + petshop.getID() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto número: " + petshop.getID() + " não foi encontrado!");
	}

	@Override
	public void deletar(int numero) {
		var buscaPetShop = buscarNaCollection(numero);

		if (buscaPetShop != null) {
			if (listaProdutos.remove(buscaPetShop) == true)
				System.out.println("\nO produto número: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto número: " + numero + " não foi encontrado!");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public PetShop buscarNaCollection(int numero) {
		for (var petshop : listaProdutos) {
			if (petshop.getID() == numero) {
				return petshop;
			}
		}

		return null;
	}

}
