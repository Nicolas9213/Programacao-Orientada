package model;
/** Documentação
 * 
 * Esta classe organiza a entrada e saída de dados
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class main {
	public static void main (String[] args) {
		//Cadastro cliente
		JLabel lbNome = new JLabel("Nome: ");
		JLabel lbData = new JLabel("Data de nascimento: ");
		JLabel lbCpf = new JLabel("CPF: ");
		JLabel lbEmail = new JLabel ("Email: ");
		JLabel lbEndereco = new JLabel ("Endereço: ");
		JLabel lbTelefone = new JLabel ("Telefone: ");
		JLabel lbLogin = new JLabel ("Login: ");
		JLabel lbSenha = new JLabel ("Senha: ");
		JTextField txNome = new JTextField();
		JTextField txData = new JTextField();
		JTextField txCpf = new JTextField();
		JTextField txEmail = new JTextField();
		JTextField txEndereco = new JTextField();
		JTextField txTelefone = new JTextField();
		JTextField txLogin = new JTextField();
		JPasswordField txSenha = new JPasswordField();
		
		Object[] componentes = {lbNome, txNome, lbData, txData, lbCpf, txCpf, lbEmail, txEmail, lbTelefone, txTelefone,
				lbLogin, txLogin, lbSenha, txSenha, lbEndereco, txEndereco};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar cliente", JOptionPane.DEFAULT_OPTION);

		Cliente cliente = new Cliente();
		
		cliente.setNome(txNome.getText());
		cliente.setDataNascimento(txData.getText());
		cliente.setCpf(txCpf.getText());
		cliente.setEmail(txEmail.getText());
		cliente.setEndereco(txEndereco.getText());
		cliente.setTelefone(txTelefone.getText());
		cliente.setLogin(txLogin.getText());
		cliente.setSenha(txSenha.getText());
		
    }
}