import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class finances extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldPriceTake;
	private JTextField textFieldQuantitySold;
	private JTextField textFieldCostofGoodSolds;
	private JTextField textFieldtotalrevenue;
	private JTextField textFieldProfitmargin;
	private JTextField textFieldpercentageloss;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finances frame = new finances();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public finances() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panel.setBounds(0, 0, 1351, 733);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panelFinanceTopic = new JPanel();
		panelFinanceTopic.setBounds(22, 20, 1306, 116);
		panelFinanceTopic.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panelFinanceTopic.setBackground(Color.WHITE);
		panel.add(panelFinanceTopic);
		panelFinanceTopic.setLayout(null);

		JLabel LabelFinances = new JLabel("F I N A N C E S");
		LabelFinances.setBackground(Color.BLACK);
		LabelFinances.setBounds(459, 23, 315, 70);
		LabelFinances.setForeground(Color.YELLOW);
		LabelFinances.setFont(new Font("Perpetua", Font.ITALIC, 60));
		LabelFinances.setHorizontalAlignment(SwingConstants.CENTER);
		panelFinanceTopic.add(LabelFinances);

		JLabel LabelFinancesPicture = new JLabel("");
		LabelFinancesPicture.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\Saved Pictures\\Walpaper3.jpg"));
		LabelFinancesPicture.setBounds(10, 11, 737, 95);
		panelFinanceTopic.add(LabelFinancesPicture);

		JLabel LabelFinancesPicture1 = new JLabel("");
		LabelFinancesPicture1.setHorizontalAlignment(SwingConstants.TRAILING);
		LabelFinancesPicture1.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\Saved Pictures\\walpaper3(1).jpg"));
		LabelFinancesPicture1.setBounds(746, 11, 550, 95);
		panelFinanceTopic.add(LabelFinancesPicture1);

		JPanel panelTable = new JPanel();
		panelTable.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panelTable.setBackground(Color.WHITE);
		panelTable.setBounds(508, 159, 820, 300);
		panel.add(panelTable);
		panelTable.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 800, 233);
		panelTable.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, },
				new String[] { "Quantity Sold", "Pricetake", "Cost Of Good Solds", "Total Revenue", "Profit Margin",
						"Percentage Loss" }));
		scrollPane.setViewportView(table);

		JPanel panelUntukIsi = new JPanel();
		panelUntukIsi.setBounds(22, 159, 462, 300);
		panel.add(panelUntukIsi);
		panelUntukIsi.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panelUntukIsi.setBackground(Color.WHITE);
		panelUntukIsi.setLayout(null);

		JLabel LabelQuantitySold = new JLabel("Quantity Sold: ");
		LabelQuantitySold.setBounds(23, 107, 177, 42);
		LabelQuantitySold.setFont(new Font("Dialog", Font.BOLD, 20));
		panelUntukIsi.add(LabelQuantitySold);

		JLabel LabelPriceTake = new JLabel("PriceTake: ");
		LabelPriceTake.setBounds(25, 27, 137, 42);
		panelUntukIsi.add(LabelPriceTake);
		LabelPriceTake.setFont(new Font("Dialog", Font.BOLD, 20));

		JLabel LabelPriceofGoodSolds = new JLabel("Cost of Good Solds: ");
		LabelPriceofGoodSolds.setBounds(25, 201, 202, 42);
		LabelPriceofGoodSolds.setFont(new Font("Dialog", Font.BOLD, 20));
		panelUntukIsi.add(LabelPriceofGoodSolds);

		textFieldPriceTake = new JTextField();
		textFieldPriceTake.setBackground(Color.YELLOW);
		textFieldPriceTake.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldPriceTake.setBounds(25, 68, 411, 29);
		panelUntukIsi.add(textFieldPriceTake);
		textFieldPriceTake.setColumns(10);

		textFieldQuantitySold = new JTextField();
		textFieldQuantitySold.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldQuantitySold.setColumns(10);
		textFieldQuantitySold.setBackground(Color.YELLOW);
		textFieldQuantitySold.setBounds(23, 159, 411, 29);
		panelUntukIsi.add(textFieldQuantitySold);

		textFieldCostofGoodSolds = new JTextField();
		textFieldCostofGoodSolds.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldCostofGoodSolds.setColumns(10);
		textFieldCostofGoodSolds.setBackground(Color.YELLOW);
		textFieldCostofGoodSolds.setBounds(25, 245, 411, 29);
		panelUntukIsi.add(textFieldCostofGoodSolds);

		JPanel panelButton = new JPanel();
		panelButton.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panelButton.setBackground(Color.WHITE);
		panelButton.setBounds(654, 469, 674, 234);
		panel.add(panelButton);
		panelButton.setLayout(null);

		JPanel panelUpdate = new JPanel();
	
		panelUpdate.setLayout(null);
		panelUpdate.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelUpdate.setBackground(Color.WHITE);
		panelUpdate.setBounds(29, 33, 180, 68);
		panelButton.add(panelUpdate);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldPriceTake.getText(),i,0);
			    	model.setValueAt(textFieldQuantitySold.getText(),i,1);
			    	model.setValueAt(textFieldCostofGoodSolds.getText(),i,2);
			      
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
		btnUpdate.setBackground(Color.RED);
		btnUpdate.setBounds(10, 10, 160, 48);
		panelUpdate.add(btnUpdate);

		JPanel panelPrint = new JPanel();
		panelPrint.setLayout(null);
		panelPrint.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelPrint.setBackground(Color.WHITE);
		panelPrint.setBounds(263, 132, 180, 68);
		panelButton.add(panelPrint);

		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Print) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPrint.setBackground(Color.RED);
		btnPrint.setBounds(10, 10, 160, 48);
		panelPrint.add(btnPrint);

		JPanel panelDelete = new JPanel();
		panelDelete.setLayout(null);
		panelDelete.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelDelete.setBackground(Color.WHITE);
		panelDelete.setBounds(263, 33, 180, 68);
		panelButton.add(panelDelete);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Finances System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Finances System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 25));
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(10, 10, 160, 48);
		panelDelete.add(btnDelete);

		JPanel panelBack = new JPanel();
		panelBack.setLayout(null);
		panelBack.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelBack.setBackground(Color.WHITE);
		panelBack.setBounds(480, 132, 180, 68);
		panelButton.add(panelBack);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();

				frame.setVisible(true);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Dialog", Font.BOLD, 25));
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(10, 10, 160, 48);
		panelBack.add(btnBack);

		JPanel panelEnter = new JPanel();
		panelEnter.setLayout(null);
		panelEnter.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelEnter.setBackground(Color.WHITE);
		panelEnter.setBounds(480, 33, 180, 68);
		panelButton.add(panelEnter);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { textFieldPriceTake.getText(), textFieldQuantitySold.getText(),
						textFieldCostofGoodSolds.getText(),textFieldtotalrevenue.getText(),textFieldProfitmargin.getText(),textFieldpercentageloss.getText(),
				});
				double PriceTake;
				double QuantitySold;
				double CostofGoodSolds;
				double totalrevenue;
				double profitmargin;
				double percentageloss;
				
				 PriceTake = Double.parseDouble(textFieldPriceTake.getText());
				 QuantitySold = Double.parseDouble(textFieldQuantitySold.getText());
			
				 CostofGoodSolds= Double.parseDouble(textFieldCostofGoodSolds.getText());
				 
				 totalrevenue = QuantitySold *PriceTake;
				 percentageloss=((totalrevenue-CostofGoodSolds)/totalrevenue)*100;
				 profitmargin=((totalrevenue-CostofGoodSolds)/CostofGoodSolds)*100;
					textFieldtotalrevenue.setText(Double.toString(totalrevenue));
					
					
					textFieldProfitmargin.setText(Double.toString(profitmargin));
					textFieldpercentageloss.setText(Double.toString(percentageloss));
				

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Information Confirmed",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setFont(new Font("Dialog", Font.BOLD, 25));
		btnEnter.setBackground(Color.RED);
		btnEnter.setBounds(10, 10, 160, 48);
		panelEnter.add(btnEnter);
		
		JPanel panelUpload = new JPanel();
		panelUpload.setLayout(null);
		panelUpload.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelUpload.setBackground(Color.WHITE);
		panelUpload.setBounds(29, 132, 180, 68);
		panelButton.add(panelUpload);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
				File file = new File("C:\\Users\\USER\\eclipse-workspace\\Assignment3\\src\\finances.txt");
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
		btnUpload.setBackground(Color.RED);
		btnUpload.setBounds(10, 10, 160, 48);
		panelUpload.add(btnUpload);
		
		JPanel panelUntukIsi_1 = new JPanel();
		panelUntukIsi_1.setLayout(null);
		panelUntukIsi_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.RED));
		panelUntukIsi_1.setBackground(Color.WHITE);
		panelUntukIsi_1.setBounds(22, 469, 622, 234);
		panel.add(panelUntukIsi_1);
		
		JLabel Labelprofitmargin = new JLabel("Profit Margin: ");
		Labelprofitmargin.setFont(new Font("Dialog", Font.BOLD, 20));
		Labelprofitmargin.setBounds(23, 81, 177, 42);
		panelUntukIsi_1.add(Labelprofitmargin);
		
		JLabel Labeltotalrevenue = new JLabel("Total revenue: ");
		Labeltotalrevenue.setFont(new Font("Dialog", Font.BOLD, 20));
		Labeltotalrevenue.setBounds(23, 16, 177, 42);
		panelUntukIsi_1.add(Labeltotalrevenue);
		
		textFieldtotalrevenue = new JTextField();
		textFieldtotalrevenue.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldtotalrevenue.setColumns(10);
		textFieldtotalrevenue.setBackground(Color.YELLOW);
		textFieldtotalrevenue.setBounds(23, 55, 435, 29);
		panelUntukIsi_1.add(textFieldtotalrevenue);
		
		textFieldProfitmargin = new JTextField();
		textFieldProfitmargin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldProfitmargin.setColumns(10);
		textFieldProfitmargin.setBackground(Color.YELLOW);
		textFieldProfitmargin.setBounds(23, 118, 435, 29);
		panelUntukIsi_1.add(textFieldProfitmargin);
		
		JLabel Labelpercentageloss = new JLabel("Percentageloss: ");
		Labelpercentageloss.setFont(new Font("Dialog", Font.BOLD, 20));
		Labelpercentageloss.setBounds(23, 145, 177, 42);
		panelUntukIsi_1.add(Labelpercentageloss);
		
		textFieldpercentageloss = new JTextField();
		textFieldpercentageloss.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldpercentageloss.setColumns(10);
		textFieldpercentageloss.setBackground(Color.YELLOW);
		textFieldpercentageloss.setBounds(23, 182, 435, 29);
		panelUntukIsi_1.add(textFieldpercentageloss);
	}
}
