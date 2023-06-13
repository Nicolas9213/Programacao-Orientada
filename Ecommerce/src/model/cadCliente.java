package model;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class cadCliente {
    public static void main (String[] args) {
  
        JLabel lbNome = new JLabel("Nome: ");
		JLabel lbCpf = new JLabel("CPF: ");
		JLabel lbEmail = new JLabel ("Email: ");
		JLabel lbEndereco = new JLabel ("Endereço: ");
		JLabel lbTelefone = new JLabel ("Telefone: ");
		JLabel lbLogin = new JLabel ("Login: ");
		JLabel lbSenha = new JLabel ("Senha: ");
		JTextField txNome = new JTextField();
		JTextField txCpf = new JTextField();
		JTextField txEmail = new JTextField();
		JTextField txEndereco = new JTextField();
		JTextField txTelefone = new JTextField();
		JTextField txLogin = new JTextField();
		JPasswordField txSenha = new JPasswordField();
		
		Object[] componentes = {lbNome, txNome, lbCpf, txCpf, lbEmail, txEmail, lbTelefone, txTelefone,
				lbLogin, txLogin, lbSenha, txSenha, lbEndereco, txEndereco};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar produto", JOptionPane.DEFAULT_OPTION);

		Cliente cliente = new Cliente();
		
		cliente.setNome(txNome.getText());
		cliente.setCpf(txCpf.getText());
		cliente.setEmail(txEmail.getText());
		cliente.setEndereco(txEndereco.getText());
		cliente.setTelefone(txTelefone.getText());
		cliente.setLogin(txLogin.getText());
		cliente.setSenha(txSenha.getText());
		
		
    }
}