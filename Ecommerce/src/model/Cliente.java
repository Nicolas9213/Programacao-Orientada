package model;

import java.util.Date;
/** Documentação
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
public class Cliente {
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private Double carteira;

	public Cliente (String nome) {
		setNome(nome);
	}
	
	public Cliente () {
		
	}
	
	public void setNome (String nome) {
		if (nome.length() > 2 && nome.matches("[A-Za-z]+")) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido!");
		}
	}

	public String getNome() {
		return nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.toString().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF inválido!");
		}
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		if (endereco.matches("[A-Za-z\\s]+")&& endereco.length() > 0) {
			this.endereco = endereco;
		} else {
			System.out.println("Endereço inválido!");
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		if (telefone.matches("[0-9]{11}")) {
			this.telefone = telefone;
		} else {
			System.out.println("Telefone inválido!");
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email.matches("[a-z0-9]+[a-z0-9_\\.]*@[a-z]+\\.[a-z]+")) {
			this.email = email;
		} else {
			System.out.println("Email inválido!");
		}
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		if (login.length() > 2 && login.matches("[A-Za-z]+")) {
			this.login = login;
		} else {
			System.out.println("Login inválido!");
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if (senha.length() > 7 && nome.matches("[A-Za-z0-9]+")) {
			this.senha = senha;
		} else {
			System.out.println("Nome inválido!");
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