package petshop.petshop.model;

public abstract class PetShop {
  private int tipo;
  private String nome;
  private float valor;
 
  public PetShop(int tipo, String nome, float valor) {
	super();
	this.tipo = tipo;
	this.nome = nome;
	this.valor = valor;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public float getValor() {
	return valor;
}

public void setValor(float valor) {
	this.valor = valor;
}
   
public void visualizar() {
	 String tipo = "";
	 
	 switch(this.tipo) {
	 case 1:
		 tipo = "Cachorro";
		 break;    		 
	 case 2:
		 tipo = "Gato";
		 break;
		 
	 }
   System.out.println("\n\n***************************************************");	 
   System.out.println("Dados do produto: ");
   System.out.println("****************************************************");
   System.out.println("Nome do produto: " + this.nome);
   System.out.println("Tipo de animal: " + tipo);
   System.out.println("Valor do produto: " + this.valor);
   
}
}