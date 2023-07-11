package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
	private JTextField txEndereco;
	private JTextField txTelefone;
	private JTextField txEmail;
	private JTextField txSenha;

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
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf:");
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txData = new JTextField();
		txData.setBounds(159, 73, 121, 20);
		contentPane.add(txData);
		txData.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento:");
		lblNewLabel_2.setBounds(10, 76, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		txEndereco = new JTextField();
		txEndereco.setBounds(159, 104, 121, 20);
		contentPane.add(txEndereco);
		txEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Endereço:");
		lblNewLabel_3.setBounds(10, 107, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		txTelefone = new JTextField();
		txTelefone.setBounds(159, 135, 121, 20);
		contentPane.add(txTelefone);
		txTelefone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setBounds(10, 138, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txEmail = new JTextField();
		txEmail.setBounds(159, 166, 121, 20);
		contentPane.add(txEmail);
		txEmail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(10, 169, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txNome.getText();
				Cliente cliente = new Cliente();
				
				
				if (cliente.setNome(txNome.getText()) == 1 && cliente.setDataNascimento(txData.getText()) == 1 &&
					cliente.setDataNascimento(txData.getText()) == 1 && cliente.setCpf(txCpf.getText()) == 1 &&
					cliente.setEmail(txEmail.getText()) == 1 && cliente.setEndereco(txEndereco.getText()) == 1 && 
					cliente.setTelefone(txTelefone.getText()) == 1 && cliente.setSenha(txSenha.getText()) == 1) {

					JOptionPane.showMessageDialog(null, "Cliente cadastrado: " + nome);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
					dispose();
				}
			}
			
		});
		btSalvar.setBounds(175, 227, 89, 23);
		contentPane.add(btSalvar);
		
		txSenha = new JTextField();
		txSenha.setBounds(159, 197, 121, 20);
		contentPane.add(txSenha);
		txSenha.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Senha:");
		lblNewLabel_6.setBounds(10, 200, 46, 14);
		contentPane.add(lblNewLabel_6);
	}
}
