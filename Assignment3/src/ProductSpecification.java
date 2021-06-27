import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class ProductSpecification extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldProductName;
	private JTextField textFieldDescription;
	private JTextField textFieldMaterial;
	private JTable table;
	private JTextField textFieldColor;
	private JTextField textFieldPrice;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSpecification frame = new ProductSpecification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ProductSpecification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1373, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(210, 105, 30)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1351, 733);
		contentPane.add(panel);
		
		JPanel panelproductTopic = new JPanel();
		panelproductTopic.setLayout(null);
		panelproductTopic.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(210, 105, 30)));
		panelproductTopic.setBackground(Color.WHITE);
		panelproductTopic.setBounds(22, 20, 1306, 116);
		panel.add(panelproductTopic);
		
		JLabel LabelProductSpecification = new JLabel("PRODUCT SPECIFICATION");
		LabelProductSpecification.setHorizontalAlignment(SwingConstants.CENTER);
		LabelProductSpecification.setForeground(new Color(144, 238, 144));
		LabelProductSpecification.setFont(new Font("OCR A Extended", Font.ITALIC, 60));
		LabelProductSpecification.setBackground(Color.BLACK);
		LabelProductSpecification.setBounds(119, 23, 1041, 70);
		panelproductTopic.add(LabelProductSpecification);
		
		JLabel LabelPicture = new JLabel("");
		LabelPicture.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\4.jpg"));
		LabelPicture.setBounds(167, 10, 1286, 96);
		panelproductTopic.add(LabelPicture);
		
		JPanel panelUntukIsi = new JPanel();
		panelUntukIsi.setLayout(null);
		panelUntukIsi.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(210, 105, 30)));
		panelUntukIsi.setBackground(Color.WHITE);
		panelUntukIsi.setBounds(22, 159, 462, 552);
		panel.add(panelUntukIsi);
		
		JLabel LabelDescription = new JLabel("Description: ");
		LabelDescription.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelDescription.setBounds(23, 107, 177, 42);
		panelUntukIsi.add(LabelDescription);
		
		JLabel LabelProductname = new JLabel("Product Name: ");
		LabelProductname.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelProductname.setBounds(25, 27, 175, 42);
		panelUntukIsi.add(LabelProductname);
		
		JLabel LabelMaterial = new JLabel("Material: ");
		LabelMaterial.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelMaterial.setBounds(25, 201, 202, 42);
		panelUntukIsi.add(LabelMaterial);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldProductName.setColumns(10);
		textFieldProductName.setBackground(new Color(240, 255, 240));
		textFieldProductName.setBounds(25, 68, 411, 29);
		panelUntukIsi.add(textFieldProductName);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldDescription.setColumns(10);
		textFieldDescription.setBackground(new Color(240, 255, 240));
		textFieldDescription.setBounds(23, 159, 411, 29);
		panelUntukIsi.add(textFieldDescription);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldMaterial.setColumns(10);
		textFieldMaterial.setBackground(new Color(240, 255, 240));
		textFieldMaterial.setBounds(25, 245, 411, 29);
		panelUntukIsi.add(textFieldMaterial);
		
		JLabel LabelColor = new JLabel("Color: ");
		LabelColor.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelColor.setBounds(25, 284, 202, 42);
		panelUntukIsi.add(LabelColor);
		
		textFieldColor = new JTextField();
		textFieldColor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldColor.setColumns(10);
		textFieldColor.setBackground(new Color(240, 255, 240));
		textFieldColor.setBounds(25, 336, 411, 29);
		panelUntukIsi.add(textFieldColor);
		
		JLabel LabelPrice = new JLabel("Price: ");
		LabelPrice.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelPrice.setBounds(23, 375, 202, 42);
		panelUntukIsi.add(LabelPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBackground(new Color(240, 255, 240));
		textFieldPrice.setBounds(23, 427, 411, 29);
		panelUntukIsi.add(textFieldPrice);
		
		JPanel panelButton = new JPanel();
		panelButton.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(210, 105, 30)));
		panelButton.setBackground(Color.WHITE);
		panelButton.setBounds(511, 143, 817, 568);
		panel.add(panelButton);
		panelButton.setLayout(null);
		
		JPanel panelUpdate = new JPanel();
		panelUpdate.setBounds(627, 23, 180, 68);
		panelButton.add(panelUpdate);
		panelUpdate.setLayout(null);
		panelUpdate.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		panelUpdate.setBackground(Color.WHITE);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldProductName.getText(),i,0);
			    	model.setValueAt(textFieldDescription.getText(),i,1);
			    	model.setValueAt(textFieldMaterial.getText(),i,2);
			    	model.setValueAt(textFieldColor.getText(),i,3);
			    	model.setValueAt(textFieldPrice.getText(),i,4);     
					JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 25));
		btnUpdate.setBackground(new Color(210, 105, 30));
		btnUpdate.setBounds(10, 10, 160, 48);
		panelUpdate.add(btnUpdate);
		
		JPanel panelPrint = new JPanel();
		panelPrint.setBounds(627, 116, 180, 68);
		panelButton.add(panelPrint);
		panelPrint.setLayout(null);
		panelPrint.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		panelPrint.setBackground(Color.WHITE);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent z) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPrint.setBackground(new Color(210, 105, 30));
		btnPrint.setBounds(10, 10, 160, 48);
		panelPrint.add(btnPrint);
		
		JPanel panelDelete = new JPanel();
		panelDelete.setBounds(627, 207, 180, 68);
		panelButton.add(panelDelete);
		panelDelete.setLayout(null);
		panelDelete.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		panelDelete.setBackground(Color.WHITE);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Product Specification", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Product Specification System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 25));
		btnDelete.setBackground(new Color(210, 105, 30));
		btnDelete.setBounds(10, 10, 160, 48);
		panelDelete.add(btnDelete);
		
		JPanel panelEnter = new JPanel();
		panelEnter.setBounds(627, 298, 180, 68);
		panelButton.add(panelEnter);
		panelEnter.setLayout(null);
		panelEnter.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		panelEnter.setBackground(Color.WHITE);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldProductName.getText(),
						textFieldDescription.getText(),
						textFieldMaterial.getText(),
						textFieldColor.getText(),
					textFieldPrice.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, " Product Specification Update confirmed", "Sum With Us Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setFont(new Font("Dialog", Font.BOLD, 25));
		btnEnter.setBackground(new Color(210, 105, 30));
		btnEnter.setBounds(10, 10, 160, 48);
		panelEnter.add(btnEnter);
		
		JPanel panelBack = new JPanel();
		panelBack.setBounds(627, 477, 180, 68);
		panelButton.add(panelBack);
		panelBack.setLayout(null);
		panelBack.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		panelBack.setBackground(Color.WHITE);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Dialog", Font.BOLD, 25));
		btnBack.setBackground(new Color(210, 105, 30));
		btnBack.setBounds(10, 10, 160, 48);
		panelBack.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 607, 329);
		panelButton.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, null},
			},
			new String[] {
				"Product Name", "Description", "Material", "Color", "Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel BtnUpload = new JPanel();
		BtnUpload.setLayout(null);
		BtnUpload.setBorder(new LineBorder(new Color(144, 238, 144), 5, true));
		BtnUpload.setBackground(Color.WHITE);
		BtnUpload.setBounds(22, 477, 180, 68);
		panelButton.add(BtnUpload);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
				File file = new File("C:\\Users\\USER\\eclipse-workspace\\Assignment3\\src\\Product Specification.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Dialog", Font.BOLD, 25));
		btnUpload.setBackground(new Color(210, 105, 30));
		btnUpload.setBounds(10, 10, 160, 48);
		BtnUpload.add(btnUpload);
		
		JLabel LabelBackground = new JLabel("");
		LabelBackground.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\StikAss\\1(5).jfif"));
		LabelBackground.setBounds(10, 10, 1331, 713);
		panel.add(LabelBackground);
	}
}
