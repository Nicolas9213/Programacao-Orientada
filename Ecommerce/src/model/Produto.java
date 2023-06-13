package model;

public class Produto {
	private String nome;
	private Double preco;
	private String categoria;
	private String avaliacao;
	private String modelo;
	private String marca;
	private String cor;
	private String descricao;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 2 && nome.matches("[A-Za-z]")) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido!");
		}
		
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido!");
		}
		
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		if (categoria.length() > 2 && categoria.matches("[A-Za-z]")) {
			this.categoria = categoria;
		} else {
			System.out.println("Categoria inválida!");
		}
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(String avaliacao) {
		if (avaliacao.length() > 2 && avaliacao.matches("[A-Za-z]")) {
			this.avaliacao = avaliacao;
		} else {
			System.out.println("Avaliacao inválida!");
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if (modelo.length() > 2 && modelo.matches("[A-Za-z]")) {
			this.modelo = modelo;
		} else {
			System.out.println("Modelo inválido!");
		}	
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if (marca.length() > 2 && marca.matches("[A-Za-z]")) {
			this.marca = marca;
		} else {
			System.out.println("Marca inválida!");
		}
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		if (cor.length() > 2 && cor.matches("[A-Za-z]")) {
			this.cor = cor;
		} else {
			System.out.println("Cor inválida!");
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() > 2 && descricao.matches("[A-Za-z]")) {
			this.descricao = descricao;
		} else {
			System.out.println("Nome inválido!");
		}
	}

}