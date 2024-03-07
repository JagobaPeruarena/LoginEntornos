package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class PantallaPrincipal {

	private JFrame frame;
	private JTextField textFiledNombre;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setToolTipText("Introduce tu nombre de usuario");
		lblNewLabel.setBounds(166, 11, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFiledNombre = new JTextField();
		textFiledNombre.setBounds(166, 36, 86, 20);
		frame.getContentPane().add(textFiledNombre);
		textFiledNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setToolTipText("Introduce tu contraseña");
		lblNewLabel_1.setBounds(176, 67, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passField = new JPasswordField();
		passField.setBounds(166, 92, 86, 20);
		frame.getContentPane().add(passField);
		
		JCheckBox chckbxRecordar = new JCheckBox("Recordarme en este ordenador");
		chckbxRecordar.setToolTipText("Haz click aqui si  quieres  que se guarden tus datos");
		chckbxRecordar.setBounds(125, 119, 175, 23);
		frame.getContentPane().add(chckbxRecordar);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.setFont(btnLogin.getFont().deriveFont(btnLogin.getFont().getStyle() | Font.BOLD));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setBounds(166, 149, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JTextPane textPanel = new JTextPane();
		textPanel.setText("");
		textPanel.setBounds(125, 183, 175, 54);
		frame.getContentPane().add(textPanel);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomString = textFiledNombre.getText();
				String contrString = passField.getText();
				if (nomString.equals("1dam3") && contrString.equals("1dam3")) {
					textPanel.setText("Bienvenido "+nomString);
					textPanel.setForeground(Color.GREEN);
					if (chckbxRecordar.isSelected()) {
						textPanel.setText("Bienvenido "+nomString+"\n La proxima vez te logearas automaticamente ");
					}
					
				}else {
					textPanel.setText("Los datos son incorrectos");
					textPanel.setForeground(Color.RED);
				}
				
						
			}
		});
	}
}
