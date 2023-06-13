package model;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Teste {
	public static void main(String[] args) {
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		//Componentes:
		JLabel lbNome = new JLabel("Nome: ");
		JLabel lbPreco = new JLabel("Preço: ");
		JLabel lbCategoria = new JLabel ("Categoria: ");
		JLabel lbAvaliacao = new JLabel ("Avaliação: ");
		JTextField txNome = new JTextField();
		JTextField txPreco = new JTextField();
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		Object[] componentes = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategoria};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar produto", JOptionPane.DEFAULT_OPTION);

		Produto p = new Produto();
		
		p.setNome(txNome.getText());
		p.setPreco(Double.parseDouble(txPreco.getText()));
		
		listaProdutos.add(p);
		//fim loop
		
		//Mostrar produtos

		for(int i = 0; i < listaProdutos.size(); i++) {
			System.out.print("\nNome: " + listaProdutos.get(i).getNome() + "\nPreço: " + listaProdutos.get(i). 
				getPreco());
		}
		for (Produto p: listaProdutos) {
			System.out.print("\nNome: " + p.getNome() + "\nPreço: " + p.getPreco());
		}
	}

}
