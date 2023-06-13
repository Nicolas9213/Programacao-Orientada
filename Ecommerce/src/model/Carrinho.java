package model;

public class Carrinho {

	private Cliente cliente; // Associação entre classes
	// Atributos: 
	public Cliente getCliente() {
		return cliente;
	}
	// Métodos: 
	public Carrinho (Cliente cliente) {
		setCliente(cliente);
	}
	// Sobrecarga de métodos:
	public Carrinho() {
		
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}