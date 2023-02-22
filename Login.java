package Formularios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Login extends JFrame {
	
	
	JPasswordField passwordField = new JPasswordField();
	private JPanel contentPane;
	private JTextField usuario;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		Login login =  new Login();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		
		
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(61, 61, 58));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(29, 27, -13, 23);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setForeground(new Color(128, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(29, 48, 144, 53);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("SENHA");
		lblNewLabel_1_1.setForeground(new Color(128, 255, 255));
		lblNewLabel_1_1.setBackground(new Color(207, 236, 252));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(29, 100, 115, 53);
		contentPane.add(lblNewLabel_1_1);

		usuario = new JTextField();
		usuario.setBounds(169, 59, 202, 29);
		contentPane.add(usuario);
		usuario.setColumns(10);

		senha = new JPasswordField();
		senha.setColumns(50);
		senha.setBounds(169, 112, 202, 29);
		contentPane.add(senha);

		JButton login = new JButton("LOGIN");
		login.setBackground(new Color(50, 50, 48));
		login.setForeground(new Color(128, 255, 255));
		login.setFont(new Font("Tahoma", Font.BOLD, 15));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				if(usuario.getText().equalsIgnoreCase("admin") && senha.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "BEM VINDO");
				} else {
					JOptionPane.showMessageDialog(null, "ERRO NO  LOGIN!");
					usuario.setText("");
					senha.setText("");
					usuario.requestFocusInWindow();
					return;

				} 
				Menu menu = new Menu();
				Login.this.setVisible(false);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				menu.setVisible(true);
			}
		});
		login.setBounds(66, 177, 122, 40);
		contentPane.add(login);

		JButton btnSair = new JButton("SAIR");
		btnSair.setForeground(new Color(128, 255, 255));
		btnSair.setBackground(new Color(50, 50, 48));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Login.this.dispose();	

			}

		});
		btnSair.setBounds(249, 177, 122, 40);
		contentPane.add(btnSair);

	}
}
