package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProduto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel Mouses = new JPanel();
		tabbedPane.addTab("Mouses", null, Mouses, null);
		Mouses.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mouses");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nicolas_gazaniga\\Downloads\\download.jfif"));
		lblNewLabel.setBounds(10, 11, 244, 163);
		Mouses.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$ 200,00");
		lblNewLabel_1.setBounds(310, 57, 67, 14);
		Mouses.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(288, 109, 89, 23);
		Mouses.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Teclados", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nicolas_gazaniga\\Downloads\\download (1).jfif"));
		lblNewLabel_2.setBounds(10, 29, 331, 152);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("R$ 200,00");
		lblNewLabel_3.setBounds(351, 167, 68, 14);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Comprar");
		btnNewButton_1.setBounds(330, 199, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Monitores", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\nicolas_gazaniga\\Downloads\\images.jfif"));
		lblNewLabel_6.setBounds(10, 29, 230, 193);
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("Comprar");
		btnNewButton_3.setBounds(292, 181, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("R$ 1000,00");
		lblNewLabel_7.setBounds(312, 132, 69, 14);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Gabinetes", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\nicolas_gazaniga\\Downloads\\download (2).jfif"));
		lblNewLabel_4.setBounds(10, 22, 198, 175);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R$ 1000,00");
		lblNewLabel_5.setBounds(278, 102, 85, 14);
		panel_3.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Comprar");
		btnNewButton_2.setBounds(262, 155, 89, 23);
		panel_3.add(btnNewButton_2);
	}
}
