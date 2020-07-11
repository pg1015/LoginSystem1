package nauka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class LoginScreen {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
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
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(259, 200, -133, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(108, 76, 89, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(108, 116, 75, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
			
				btnLogin.setBackground(new Color(0, 101, 183));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
			
				btnLogin.setBackground(new Color(0, 101, 194));
			}
			
		});
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(184, 166, 145, 25);
		frame.getContentPane().add(btnLogin);
		
		Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black); //zmienna do zaznaczenia ram ikon
		
		JLabel jLabel_minimize = new JLabel("-");
		jLabel_minimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
				jLabel_minimize.setBorder(label_border);
				jLabel_minimize.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
				jLabel_minimize.setBorder(label_border);
				jLabel_minimize.setForeground(Color.black);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				frame.setState(JFrame.ICONIFIED);
				
			}
			
		});
		jLabel_minimize.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_minimize.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jLabel_minimize.setBounds(346, 13, 38, 37);
		jLabel_minimize.setBorder(label_border);
		frame.getContentPane().add(jLabel_minimize);
		
		JLabel jLable_close = new JLabel("x");
		jLable_close.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
				jLable_close.setBorder(label_border);
				jLable_close.setForeground(Color.white);
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
				jLable_close.setBorder(label_border);
				jLable_close.setForeground(Color.black);
			}
			
		
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			});
		
		jLable_close.setHorizontalAlignment(SwingConstants.CENTER);
		jLable_close.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jLable_close.setBounds(400, 13, 38, 37);
		jLable_close.setBorder(label_border);
		frame.getContentPane().add(jLable_close);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e) {
			
				if(txtUsername.getText().trim().toLowerCase().equals("username")) {
					
					txtUsername.setText("");
					txtUsername.setForeground(Color.black);
				}
			}
			
			@Override
			public void focusLost(FocusEvent arg0) {
					if(txtUsername.getText().trim().toLowerCase().equals("username") 
					   || txtUsername.getText().trim().toLowerCase().equals("")) {
					
					txtUsername.setText("username");
					txtUsername.setForeground(new Color(153, 153, 153));
				}
			}
			
		});
		txtUsername.setText("username");
		txtUsername.setFocusCycleRoot(true);
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setBounds(184, 86, 145, 22);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent arg0) {
				
			String pass = String.valueOf(pwdPassword.getPassword());
				if(pass.trim().toLowerCase().equals("password")) {
					pwdPassword.setText("");
					pwdPassword.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = String.valueOf(pwdPassword.getPassword());
				if(pass.trim().equals("password") 
						   || pass.trim().equals("")) {
						
					pwdPassword.setText("username");
					pwdPassword.setForeground(new Color(153, 153, 153));

				
			}
		   }
		});
		pwdPassword.setText("password");
		pwdPassword.setBounds(184, 130, 145, 22);
		frame.getContentPane().add(pwdPassword);
	}
}
