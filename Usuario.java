package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField id_Usuario;
	private JTextField nome_Cad;
	private JTextField sobrenome_cad;
	private JTextField campo_senha_U;
	private JLabel lblSenha;
	private JLabel lblConfisenha;
	private JTextField Confirme_senha;
	private JButton sair;
	private JButton novo;
	private JButton cancelar;

	public static void main(String[] args) {

		Usuario usuario =  new Usuario();
		usuario.setLocationRelativeTo(null);
		usuario.setVisible(true);


	}


	public Usuario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(37, 37, 37));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID Usuario :");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setBounds(27, 28, 129, 51);
		contentPane.add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome :");
		lblNome.setForeground(new Color(128, 255, 255));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBackground(new Color(128, 255, 255));
		lblNome.setBounds(27, 64, 129, 51);
		contentPane.add(lblNome);

		JLabel lblSobrenome = new JLabel("Sobrenome :");
		lblSobrenome.setForeground(new Color(128, 255, 255));
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSobrenome.setBackground(new Color(128, 255, 255));
		lblSobrenome.setBounds(27, 102, 129, 51);
		contentPane.add(lblSobrenome);

		id_Usuario = new JTextField();
		id_Usuario.setEnabled(false);
		id_Usuario.setBounds(216, 44, 258, 26);
		contentPane.add(id_Usuario);
		id_Usuario.setColumns(10);

		nome_Cad = new JTextField();
		nome_Cad.setEnabled(false);
		nome_Cad.setColumns(10);
		nome_Cad.setBounds(216, 80, 258, 26);
		contentPane.add(nome_Cad);

		sobrenome_cad = new JTextField();
		sobrenome_cad.setEnabled(false);
		sobrenome_cad.setColumns(10);
		sobrenome_cad.setBounds(216, 118, 258, 26);
		contentPane.add(sobrenome_cad);

		campo_senha_U = new JPasswordField();
		campo_senha_U.setEnabled(false);
		campo_senha_U.setColumns(10);
		campo_senha_U.setBounds(216, 153, 258, 26);
		contentPane.add(campo_senha_U);

		lblSenha = new JLabel("Senha :");
		lblSenha.setForeground(new Color(128, 255, 255));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSenha.setBackground(new Color(128, 255, 255));
		lblSenha.setBounds(27, 137, 129, 51);
		contentPane.add(lblSenha);

		lblConfisenha = new JLabel("Confirme Senha :");
		lblConfisenha.setForeground(new Color(128, 255, 255));
		lblConfisenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblConfisenha.setBackground(new Color(128, 255, 255));
		lblConfisenha.setBounds(27, 176, 187, 51);
		contentPane.add(lblConfisenha);

		Confirme_senha = new JPasswordField();
		Confirme_senha.setEnabled(false);
		Confirme_senha.setColumns(10);
		Confirme_senha.setBounds(216, 190, 258, 26);
		contentPane.add(Confirme_senha);

		JButton salvar = new JButton("SALVAR");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				salvar.setEnabled(false);
				cancelar.setEnabled(false);
				novo.setEnabled(true);
				sair.setEnabled(true);
				
				//desabilitar os campos
				id_Usuario.setEnabled(false);
				nome_Cad.setEnabled(false);
				sobrenome_cad.setEnabled(false);
				campo_senha_U.setEnabled(false);
				Confirme_senha.setEnabled(false);

			}
		});
		salvar.setBackground(new Color(0, 0, 0));
		salvar.setForeground(new Color(128, 255, 255));
		salvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		salvar.setBounds(27, 238, 100, 36);
		contentPane.add(salvar);

		sair = new JButton("SAIR");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sair.setForeground(new Color(128, 255, 255));
		sair.setFont(new Font("Tahoma", Font.BOLD, 15));
		sair.setBackground(Color.BLACK);
		sair.setBounds(396, 238, 100, 36);
		contentPane.add(sair);

		novo = new JButton("NOVO");
		novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				salvar.setEnabled(true);
				cancelar.setEnabled(true);
				novo.setEnabled(false);
				sair.setEnabled(false);
				
				//caixa de textos
				
				id_Usuario.setEnabled(true);
				nome_Cad.setEnabled(true);
				sobrenome_cad.setEnabled(true);
				campo_senha_U.setEnabled(true);
				Confirme_senha.setEnabled(true);
				
				//limpar campos
				
				id_Usuario.setText("");
				nome_Cad.setText("");
				sobrenome_cad.setText("");
				campo_senha_U.setText("");
				Confirme_senha.setText("");

				id_Usuario.requestFocus();

				

			}
		});
		novo.setForeground(new Color(128, 255, 255));
		novo.setFont(new Font("Tahoma", Font.BOLD, 15));
		novo.setBackground(Color.BLACK);
		novo.setBounds(198, 238, 100, 36);
		contentPane.add(novo);

		cancelar = new JButton("CANCELAR");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvar.setEnabled(true);
				cancelar.setEnabled(true);
				novo.setEnabled(false);
				sair.setEnabled(false);

			}
		});
		cancelar.setForeground(new Color(128, 255, 255));
		cancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		cancelar.setBackground(Color.BLACK);
		cancelar.setBounds(163, 285, 161, 36);
		contentPane.add(cancelar);
	}
}
