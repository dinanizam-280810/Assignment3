import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabelUsername;
	private JTextField textFieldUsername;
	private JTextField textField_1Password;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 774);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login ", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 10, 1336, 636);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabelUsername = new JLabel("USERNAME: ");
		lblNewLabelUsername.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblNewLabelUsername.setForeground(new Color(255, 255, 255));
		lblNewLabelUsername.setBounds(111, 73, 277, 116);
		panel.add(lblNewLabelUsername);

		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldUsername.setBounds(111, 156, 1125, 73);
		panel.add(textFieldUsername);
		textFieldUsername.setColumns(10);

		JLabel lblNewLabelPassword = new JLabel("PASSWORD: ");
		lblNewLabelPassword.setForeground(new Color(245, 245, 220));
		lblNewLabelPassword.setBackground(new Color(255, 239, 213));
		lblNewLabelPassword.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblNewLabelPassword.setBounds(111, 269, 189, 59);
		panel.add(lblNewLabelPassword);

		textField_1Password = new JTextField();
		textField_1Password.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1Password.setBounds(111, 318, 1125, 73);
		panel.add(textField_1Password);
		textField_1Password.setColumns(10);

		JButton btnNewButtonEnter = new JButton("Enter");

		btnNewButtonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if (textFieldUsername.getText().equals("Dina") && textField_1Password.getText().equals("280810")) {
				JOptionPane.showMessageDialog(null, "Login Successful");
				Home frame = new Home();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
					else if(textFieldUsername.getText().equals("User") && textField_1Password.getText().equals("123456")) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						Home frame = new Home();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");
				}catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");}
					}
		});

		btnNewButtonEnter.setBackground(SystemColor.textHighlight);
		btnNewButtonEnter.setFont(new Font("Dialog", Font.ITALIC, 25));
		btnNewButtonEnter.setBounds(1111, 499, 104, 45);
		panel.add(btnNewButtonEnter);

		JButton btnNewButtonCancel = new JButton("Cancel");
		btnNewButtonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please Come Again");
			}
		});
		btnNewButtonCancel.setFont(new Font("Dialog", Font.ITALIC, 25));
		btnNewButtonCancel.setBackground(SystemColor.textHighlight);
		btnNewButtonCancel.setBounds(916, 499, 114, 45);
		panel.add(btnNewButtonCancel);

		JComboBox comboBoxLogin = new JComboBox();
		comboBoxLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBoxLogin.setForeground(SystemColor.controlText);
		comboBoxLogin.setModel(new DefaultComboBoxModel(new String[] { "", "Admin", "User" }));
		comboBoxLogin.setFont(new Font("Dialog", Font.PLAIN, 20));
		comboBoxLogin.setBackground(SystemColor.activeCaption);
		comboBoxLogin.setBounds(1186, 41, 114, 38);
		panel.add(comboBoxLogin);
	}
}
