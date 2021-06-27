import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1385, 892);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1361, 750);
		contentPane.add(panel_1);
		panel_1.setBorder(new MatteBorder(7, 6, 7, 6, (Color) new Color(176, 196, 222)));
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 25, 1138, 99);
		panel_1.add(panel);
		panel.setBorder(new MatteBorder(7, 6, 7, 6, (Color) new Color(176, 196, 222)));
		panel.setBackground(new Color(240, 255, 240));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Company Background");
		lblNewLabel.setBounds(267, 10, 630, 77);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vivaldi", Font.ITALIC, 60));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(7, 6, 7, 6, (Color) new Color(176, 196, 222)));
		panel_2.setBackground(new Color(240, 255, 240));
		panel_2.setBounds(323, 181, 757, 482);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Company Name: Dina Batik Company ");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(80, 89, 590, 71);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.ITALIC, 35));
		
		JLabel lblNewLabel_2 = new JLabel("Address: Lot 27, Jalan Tembikai 6, 07000 Pantai Cenang, Langkawi");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.ITALIC, 25));
		lblNewLabel_2.setBounds(28, 147, 698, 97);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number: 0136743110");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.ITALIC, 25));
		lblNewLabel_3.setBounds(27, 234, 590, 59);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Website: www.DinaaBatikCompany.com.my");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.ITALIC, 25));
		lblNewLabel_4.setBounds(28, 373, 600, 79);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fax Number: 07485678");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.ITALIC, 25));
		lblNewLabel_5.setBounds(27, 303, 574, 59);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\2c18bafa5a1c40b0881c07800beab69e.jpg"));
		lblNewLabel_6.setBounds(10, 10, 735, 462);
		panel_2.add(lblNewLabel_6);
	}
}
