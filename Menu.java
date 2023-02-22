package Formularios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Menu extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 361);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(37, 37, 37));
		setJMenuBar(menuBar);
		
		JMenu arquivos = new JMenu("Arquivos");
		arquivos.setForeground(new Color(128, 255, 255));
		arquivos.setBackground(new Color(255, 255, 255));
		menuBar.add(arquivos);
		
		JMenuItem cliente = new JMenuItem("Clientes");
		arquivos.add(cliente);
		
		JMenuItem produtos = new JMenuItem("Produtos");
		arquivos.add(produtos);
		
		JMenuItem bUsuario = new JMenuItem("Usuarios");
		bUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				Menu.this.setVisible(false);
				usuario.setVisible(true);
				usuario.setLocationRelativeTo(null);
				usuario.setVisible(true);
			}
		});
		arquivos.add(bUsuario);
	
		JMenuItem altSenha = new JMenuItem("Alterar Senha");
		arquivos.add(altSenha);
		altSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				Menu.this.setVisible(false);
				usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
				usuario.setVisible(true);
			}
		});
		
		JMenuItem altusuario = new JMenuItem("Alterar Usuario");
		arquivos.add(altusuario);
		
		JMenuItem sair_menu = new JMenuItem("Sair");
		arquivos.add(sair_menu);
		
		JMenu movimentos = new JMenu("Movimentos");
		movimentos.setForeground(new Color(128, 255, 255));
		movimentos.setBackground(new Color(255, 255, 255));
		menuBar.add(movimentos);
		
		JMenuItem vendas = new JMenuItem("Vendas");
		movimentos.add(vendas);
		
		JMenuItem re_vendas = new JMenuItem("Relatorios Vendas");
		movimentos.add(re_vendas);
		
		JMenu ajuda = new JMenu("Ajuda");
		ajuda.setForeground(new Color(128, 255, 255));
		menuBar.add(ajuda);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		ajuda.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ajuda");
		ajuda.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(37, 37, 37));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(51, 87, 173, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(51, 169, 173, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Produto");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(90, 52, 109, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPreo = new JLabel("Preço");
		lblPreo.setForeground(Color.CYAN);
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPreo.setBounds(102, 134, 85, 24);
		contentPane.add(lblPreo);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setEnabled(false);
		txtTotal.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setText("TOTAL");
		txtTotal.setColumns(10);
		txtTotal.setBounds(293, 37, 238, 133);
		contentPane.add(txtTotal);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(116, 230, 155, 42);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancelar.setBounds(323, 230, 155, 42);
		contentPane.add(btnCancelar);
		
		
	
		
	}
}
