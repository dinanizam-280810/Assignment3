import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class Home extends JFrame {

	private JPanel contentPane;
	
	private JTextField textBatikCompany;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1415, 996);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(7, 5, 7, 5, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(255, 160, 122));
		panel.setBounds(0, 0, 1258, 810);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 10, 1248, 171);
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel LabelLogo = new JLabel("New label");
		LabelLogo.setBounds(-259, -14, 470, 217);
		panel_1.add(LabelLogo);
		LabelLogo.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\decd80c01ff8d6f17c05e63608aa8edf.jpg"));

		textBatikCompany = new JTextField();
		textBatikCompany.setBounds(233, 28, 433, 54);
		textBatikCompany.setFont(new Font("MS Reference Sans Serif", Font.ITALIC, 30));
		textBatikCompany.setBackground(new Color(0, 0, 0));
		textBatikCompany.setForeground(Color.WHITE);
		textBatikCompany.setText("BATIK COMPANY ");
		panel_1.add(textBatikCompany);
		textBatikCompany.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(212, 113, 1248, 58);
		panel_1.add(menuBar);

		JMenu menuhome = new JMenu("Home ");
		menuBar.add(menuhome);

		JMenuItem itemHome = new JMenuItem("Home");
		itemHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		menuhome.add(itemHome);

		JMenu menuadmin = new JMenu("Admin");
		menuBar.add(menuadmin);

		JMenuItem itemEmployees = new JMenuItem("Employees");
		itemEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employees1 frame = new Employees1();
				frame.setVisible(true);
				dispose();
				
			}
		});
		menuadmin.add(itemEmployees);

		JMenuItem itemFinances = new JMenuItem("Finances");
		itemFinances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finances frame = new finances();
				frame.setVisible(true);
				dispose();
			}
		});
		menuadmin.add(itemFinances);

		JMenuItem itemProductSpecification = new JMenuItem("Product Specification");
		itemProductSpecification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductSpecification frame = new ProductSpecification();
				frame.setVisible(true);
				dispose();
			}
		});
		menuadmin.add(itemProductSpecification);

		JMenu menuUser = new JMenu("User");
		menuBar.add(menuUser);

		JMenuItem itemPromotion = new JMenuItem("Promotion");
		itemPromotion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promotion frame = new Promotion();
				frame.setVisible(true);
				dispose();
			}
		});
		menuUser.add(itemPromotion);

		JMenuItem itemFeedback = new JMenuItem("Feedback");
		itemFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedback frame = new Feedback();
				frame.setVisible(true);
				dispose();
			}
		});
		menuUser.add(itemFeedback);

		JMenu menuAboutUs = new JMenu("About Us ");
		menuBar.add(menuAboutUs);

		JMenuItem itemCompanyBackground = new JMenuItem("Company Background");
		itemCompanyBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground frame = new CompanyBackground();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		menuAboutUs.add(itemCompanyBackground);

		JButton ButtonLogOut = new JButton("LogOut");
		ButtonLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Succesfully Log Out");
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		ButtonLogOut.setBackground(new Color(30, 144, 255));
		ButtonLogOut.setFont(new Font("Dialog", Font.ITALIC, 20));
		ButtonLogOut.setBounds(1132, 65, 106, 38);
		panel_1.add(ButtonLogOut);

		JLabel LabelGardenRaya = new JLabel("The Garden Raya Batik Exhibition 2013");
		LabelGardenRaya.setHorizontalAlignment(SwingConstants.CENTER);
		LabelGardenRaya.setFont(new Font("Californian FB", Font.ITALIC, 50));
		LabelGardenRaya.setBounds(55, 209, 1181, 51);
		panel.add(LabelGardenRaya);

		JLabel LabelPicture1 = new JLabel("New label");
		LabelPicture1.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\1(1).jpg"));
		LabelPicture1.setBounds(72, 280, 490, 457);
		panel.add(LabelPicture1);

		JLabel LabelPicture2 = new JLabel("");
		LabelPicture2.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\2.jpg"));
		LabelPicture2.setBounds(583, 280, 665, 457);
		panel.add(LabelPicture2);
	}


}
