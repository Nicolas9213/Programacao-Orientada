package model;

public class Pagamento {
    private String forma;
    private int parcelamento;
    private Double desconto;
    private Double total;
    private Double frete;

    public String getForma () {
        return forma;
    }

    public void setForma (String forma) {
        if (forma.length() > 2 && forma.matches("[A-Aa-z]")) {
            this.forma = forma;
        } else {
            System.out.println("Forma de pagamento inv�lida!");
        }
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        if (parcelamento >= 12){
            this.parcelamento = parcelamento;
        } else {
            System.out.println("Parcelamento inv�lido!");
        }
    }

    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {

    }
}