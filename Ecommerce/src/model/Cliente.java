package model;
/** Documenta��o
 * 
 * Esta classe organiza e gerencia os dados do cliente
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
public class Cliente {
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private Double carteira;
	private Carrinho carrinho;

	public Cliente (String nome) {
		setNome(nome);
	}
	
	public Cliente () {
		
	}
	
	public int setNome (String nome) {
		if (nome.length() > 2 && nome.matches("[A-Za-z]+")) {
			this.nome = nome;
			return 1;
		} else {
			System.out.println("Nome invalido!");
			return 0;
		}
	}

	public String getNome() {
		return nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public int setDataNascimento(String dataNascimento) {
		if (dataNascimento.length() > 7){
			this.dataNascimento = dataNascimento;
			return 1;

		} else {		
			System.out.println("Data invalida!");
			return 0;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int setCpf(String cpf) {
		if (cpf.toString().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
			return 1;
		} else {
			System.out.println("CPF invalido!");
			return 0;
		}
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public int setEndereco(String endereco) {
		if (endereco.matches("[A-Za-z\\s]+")&& endereco.length() > 0) {
			this.endereco = endereco;
			return 1;
		} else {
			System.out.println("Endere�o invalido!");
			return 0;
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public int setTelefone(String telefone) {
		if (telefone.matches("[0-9]{11}")) {
			this.telefone = telefone;
			return 1;
		} else {
			System.out.println("Telefone invalido!");
			return 0;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public int setEmail(String email) {
		if (email.matches("[a-z0-9]+[a-z0-9_\\.]*@[a-z]+\\.[a-z]+")) {
			this.email = email;
			return 1;
		} else {
			System.out.println("Email invalido!");
			return 0;
		}
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		if (login.length() > 2 && login.matches("[A-Za-z]+")) {
			this.login = login;
		} else {
			System.out.println("Login invalido!");
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public int setSenha(String senha) {
		if (senha.length() > 7 && nome.matches("[A-Za-z0-9]+")) {
			this.senha = senha;
			return 1;
		} else {
			System.out.println("Senha invalida!");
			return 0;
		}
	}
	
	public Double getCarteira() {
		return carteira;
	}
	
	public void setCarteira(Double carteira) {
		if (carteira > 0) {
			this.carteira = carteira;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}