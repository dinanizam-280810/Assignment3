import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Feedback extends JFrame {

	
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldFeedbackTitle;
	private JTextField textFieldComment;
private final JTextField textfield= new JTextField();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback frame = new Feedback();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Feedback() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1371, 764);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 240));
		panel.setBorder(new MatteBorder(4, 5, 4, 5, (Color) new Color(178, 34, 34)));
		panel.setBounds(10, 0, 1337, 707);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(225, 22, 829, 157);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Feedback(1).png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(143, 188, 143), 6));
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(10, 10, 1317, 170);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(144, 233, 97, 30);
		panel.add(lblNewLabel_1);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(144, 273, 473, 30);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Feedback Title: ");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(144, 326, 190, 30);
		panel.add(lblNewLabel_1_1);
		
		textFieldFeedbackTitle = new JTextField();
		textFieldFeedbackTitle.setColumns(10);
		textFieldFeedbackTitle.setBounds(144, 366, 473, 119);
		panel.add(textFieldFeedbackTitle);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Comment: ");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(144, 511, 190, 30);
		panel.add(lblNewLabel_1_1_1);
		
		textFieldComment = new JTextField();
		textFieldComment.setColumns(10);
		textFieldComment.setBounds(144, 551, 473, 119);
		panel.add(textFieldComment);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_1_1.setBackground(new Color(240, 255, 255));
		panel_1_1.setBounds(761, 341, 501, 185);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JRadioButton rdbtn1Star = new JRadioButton("1 Star");
		rdbtn1Star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Poor");
			}
		});
		rdbtn1Star.setFont(new Font("Rockwell Condensed", Font.PLAIN, 25));
		rdbtn1Star.setBackground(Color.ORANGE);
		rdbtn1Star.setBounds(35, 110, 120, 45);
		panel_1_1.add(rdbtn1Star);
		
		JRadioButton rdbtn2Star = new JRadioButton("2 Star");
		rdbtn2Star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Moderate");
			}
		});
		;
		rdbtn2Star.setFont(new Font("Rockwell Condensed", Font.PLAIN, 25));
		rdbtn2Star.setBackground(Color.ORANGE);
		rdbtn2Star.setBounds(201, 110, 120, 45);
		panel_1_1.add(rdbtn2Star);
		
		JRadioButton rdbtn3Star = new JRadioButton("3 Star");
		rdbtn3Star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Excellent");
			}
		});
		rdbtn3Star.setFont(new Font("Rockwell Condensed", Font.PLAIN, 25));
		rdbtn3Star.setBackground(Color.ORANGE);
		rdbtn3Star.setBounds(341, 110, 120, 45);
		panel_1_1.add(rdbtn3Star);
		
		JLabel LabelStar = new JLabel("Please give us your rate!");
		LabelStar.setFont(new Font("Dialog", Font.BOLD, 25));
		LabelStar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelStar.setBounds(35, 10, 426, 33);
		panel_1_1.add(LabelStar);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldFeedbackTitle.setText("");
				textFieldComment.setText("");
				
		
			}
		});
		btnreset.setBackground(new Color(240, 128, 128));
		btnreset.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnreset.setBounds(1053, 629, 138, 41);
		panel.add(btnreset);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
		
				
			
					JOptionPane.showMessageDialog(null, "Your Feedback has been sent, Thank You for choosing us!");
				}
			});
		
		btnSubmit.setBackground(new Color(240, 128, 128));
		btnSubmit.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnSubmit.setBounds(844, 629, 138, 41);
		panel.add(btnSubmit);
	}
}
