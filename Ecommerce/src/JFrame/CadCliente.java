package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import model.Cliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txCpf;
	private JTextField txData;
	private JTextField txCep;
	private JTextField txTelefone;
	private JTextField txEmail;
	private JPasswordField txSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCliente frame = new CadCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txCpf = new JTextField();
		txCpf.setBounds(159, 42, 121, 20);
		contentPane.add(txCpf);
		txCpf.setColumns(10);
		
		txNome = new JTextField();
		txNome.setBounds(159, 11, 121, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(42, 14, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCpf = new JLabel("Cpf:");
		lbCpf.setBounds(42, 45, 46, 14);
		contentPane.add(lbCpf);
		
		txData = new JTextField();
		txData.setBounds(159, 73, 121, 20);
		contentPane.add(txData);
		txData.setColumns(10);
		
		JLabel lbData = new JLabel("Data de Nascimento:");
		lbData.setBounds(42, 76, 107, 14);
		contentPane.add(lbData);
		
		txCep = new JTextField();
		txCep.setBounds(159, 104, 121, 20);
		contentPane.add(txCep);
		txCep.setColumns(10);
		
		JLabel lbCep = new JLabel("Cep:");
		lbCep.setBounds(42, 107, 81, 14);
		contentPane.add(lbCep);
		
		txTelefone = new JTextField();
		txTelefone.setBounds(159, 135, 121, 20);
		contentPane.add(txTelefone);
		txTelefone.setColumns(10);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setBounds(42, 138, 46, 14);
		contentPane.add(lbTelefone);
		
		txEmail = new JTextField();
		txEmail.setBounds(159, 166, 121, 20);
		contentPane.add(txEmail);
		txEmail.setColumns(10);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setBounds(42, 169, 46, 14);
		contentPane.add(lbEmail);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txNome.getText();
				Cliente cliente = new Cliente();
				
				
				if (cliente.setNome(txNome.getText()) == 1 && cliente.setDataNascimento(txData.getText()) == 1 &&
					cliente.setDataNascimento(txData.getText()) == 1 && cliente.setCpf(txCpf.getText()) == 1 &&
					cliente.setEmail(txEmail.getText()) == 1 && cliente.setCep(txCep.getText()) == 1 && 
					cliente.setTelefone(txTelefone.getText()) == 1 && cliente.setSenha(txSenha.getText()) == 1) {

					JOptionPane.showMessageDialog(null, "Cliente cadastrado: " + nome);
					
					contentPane.setVisible(false);
					TelaLogin login = new TelaLogin();
				
					login.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
					dispose();
				}
			}
			
		});
		btSalvar.setBounds(175, 227, 89, 23);
		contentPane.add(btSalvar);
		
		txSenha = new JPasswordField();
		txSenha.setBounds(159, 196, 121, 20);
		contentPane.add(txSenha);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setBounds(42, 202, 46, 14);
		contentPane.add(lbSenha);
		
	}
}
