package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Documenta��o
 * 
 * Esta classe organiza a entrada e sa�da de dados
 * 
 * @author Nicolas Augusto Gazaniga
 *
 */
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import JFrame.CadCliente;
import JFrame.TelaLogin;

public class main {
	public static void main (String[] args) {
		
		CadCliente telaCliente = new CadCliente();
		TelaLogin telaLogin = new TelaLogin();
		
		telaLogin.setVisible(true);
		telaLogin.btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin.dispose();
				telaCliente.setVisible(true);
			}
		});
    }
}