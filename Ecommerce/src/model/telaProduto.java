package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class telaProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaProduto frame = new telaProduto();
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
	public telaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(175, 37, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.setBounds(172, 223, 89, 23);
		contentPane.add(btSalvar);
		
		textField = new JTextField();
		textField.setBounds(175, 68, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(119, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preço");
		lblNewLabel_1.setBounds(119, 71, 34, 14);
		contentPane.add(lblNewLabel_1);
	}
}
