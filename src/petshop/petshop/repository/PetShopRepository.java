package petshop.petshop.repository;

import petshop.petshop.model.PetShop;

public interface PetShopRepository {

	public void procurarPorNumero(int numero);

	public void listarTodos();

	public void cadastrar(PetShop petshop);

	public void atualizar(PetShop petshop);

	public void deletar(int ID);

}
