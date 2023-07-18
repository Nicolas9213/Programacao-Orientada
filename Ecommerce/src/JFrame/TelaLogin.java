package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txxNome;
	private JTextField txxSenha;
	public JButton btCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txxNome = new JTextField();
		txxNome.setBounds(155, 59, 130, 20);
		contentPane.add(txxNome);
		txxNome.setColumns(10);
		
		txxSenha = new JTextField();
		txxSenha.setBounds(155, 109, 130, 20);
		contentPane.add(txxSenha);
		txxSenha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Faça login:");
		lblNewLabel.setBounds(192, 29, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel txNome = new JLabel("Nome:");
		txNome.setBounds(99, 62, 46, 14);
		contentPane.add(txNome);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setBounds(99, 112, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ainda não possui cadastro?");
		lblNewLabel_3.setBounds(131, 202, 241, 14);
		contentPane.add(lblNewLabel_3);
		
		btCadastro = new JButton("Cadastrar");
		btCadastro.setBounds(177, 227, 89, 23);
		contentPane.add(btCadastro);
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				CadCliente cadastro = new CadCliente();
				
				cadastro.setVisible(true);
			}
		});
		
		JButton btLogin = new JButton("Login");
		btLogin.setBounds(177, 152, 89, 23);
		contentPane.add(btLogin);
		
		JLabel lblNewLabel_1 = new JLabel("SEJA BEM VINDO A NOSSA LOJA VIRTUAL!");
		lblNewLabel_1.setBounds(112, 4, 287, 14);
		contentPane.add(lblNewLabel_1);
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadCliente cadastro = new CadCliente();
				
				contentPane.setVisible(false);
				TelaMenu menu = new TelaMenu();
				
				menu.setVisible(true);
			}
		});
	}
}
