package model;
/** Documentação
 * 
 * Esta classe organiza e gerencia os dados da classe endereço
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
public class Endereco {
    private String identificacao;
    private String rua;
    private String cep;
    private String cidade;
    private String estado;
    private int numero;
    private String complemento;
    
    
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		if (identificacao.length() > 3) {
			this.identificacao = identificacao;
		}
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if (rua.length() > 3) {
			this.rua = rua;
		}
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.toString().matches("[0-9]{5}[0-9]{3}")){
			this.cep = cep;
		} else {
			System.out.println("Cep inválido!");
		}
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if (cidade.length() > 5) {
			this.cidade = cidade;
		} else {
			System.out.println("Cidade inválida!");
		}
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if (estado.matches("[A-Z]{2}") && estado.length() == 2) {
			this.estado = estado;
		} else {
			System.out.println("Estado inválido!");
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero >= 1) {
			this.numero = numero;
		}
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		if (complemento.length() > 0) {
			this.complemento = complemento;
		}
	}

}