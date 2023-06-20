package model;
/** Documenta��o
 * 
 * Esta classe organiza e gerencia os dados do carrinho
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
public class Carrinho {

	private Cliente cliente; // Associa��o entre classes
	// Atributos: 
	public Cliente getCliente() {
		return cliente;
	}
	// M�todos: 
	public Carrinho (Cliente cliente) {
		setCliente(cliente);
	}
	// Sobrecarga de m�todos:
	public Carrinho() {
		
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}