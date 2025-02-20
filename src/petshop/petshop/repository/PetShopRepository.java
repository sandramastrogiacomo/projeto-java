package petshop.petshop.repository;

import petshop.petshop.model.PetShop;

public interface PetShopRepository {
  
	public void procurarPorNome(String nome);

	public void listarTodos();

	public void cadastrar(PetShop petshop);

	public void atualizar(PetShop petshop);

	public void deletar( PetShop petshop);

	
}

	
