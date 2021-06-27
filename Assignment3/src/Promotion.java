import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Promotion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldNormalPrice;
	private JTextField textFieldDiscountofProduct;
	private JTextField textFieldPriceAfterDiscount;
	private JTextField textFieldPayment;
	private JTextField textFieldChanges;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promotion frame = new Promotion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Promotion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1372, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 1358, 713);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(10, 5, 1338, 80);
		panel_1.setBackground(new Color(240, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("P R O M O T I O N");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setBackground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.ITALIC, 50));
		lblNewLabel.setBounds(386, 10, 502, 61);
		panel_1.add(lblNewLabel);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1_1.setBackground(new Color(255, 255, 204));
		panel_1_1.setBounds(20, 454, 820, 249);
		panel.add(panel_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 800, 233);
		panel_1_1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { }, },
				new String[] { "Normal Price", "Discount of Product", "Price After Discount", "Total Price",
						"Your Payment", "Changes" }));
		scrollPane.setViewportView(table);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 0)));
		panel_1_1_1_1.setBackground(new Color(255, 255, 204));
		panel_1_1_1_1.setBounds(10, 121, 462, 323);
		panel.add(panel_1_1_1_1);

		JLabel LabelDiscountofProduct = new JLabel("Discount of Product: ");
		LabelDiscountofProduct.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelDiscountofProduct.setBounds(23, 107, 204, 42);
		panel_1_1_1_1.add(LabelDiscountofProduct);

		JLabel LabelNormalPrice = new JLabel("Normal Price: ");
		LabelNormalPrice.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelNormalPrice.setBounds(25, 27, 137, 42);
		panel_1_1_1_1.add(LabelNormalPrice);

		textFieldNormalPrice = new JTextField();
		textFieldNormalPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldNormalPrice.setColumns(10);
		textFieldNormalPrice.setBackground(Color.YELLOW);
		textFieldNormalPrice.setBounds(25, 68, 411, 29);
		panel_1_1_1_1.add(textFieldNormalPrice);

		textFieldDiscountofProduct = new JTextField();
		textFieldDiscountofProduct.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldDiscountofProduct.setColumns(10);
		textFieldDiscountofProduct.setBackground(Color.YELLOW);
		textFieldDiscountofProduct.setBounds(23, 159, 411, 29);
		panel_1_1_1_1.add(textFieldDiscountofProduct);

		JLabel LabelPayment = new JLabel("Payment: ");
		LabelPayment.setBounds(23, 214, 204, 42);
		panel_1_1_1_1.add(LabelPayment);
		LabelPayment.setFont(new Font("Dialog", Font.BOLD, 20));

		textFieldPayment = new JTextField();
		textFieldPayment.setBounds(23, 261, 411, 29);
		panel_1_1_1_1.add(textFieldPayment);
		textFieldPayment.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldPayment.setColumns(10);
		textFieldPayment.setBackground(Color.YELLOW);

		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 0)));
		panel_1_1_1_1_1.setBackground(new Color(255, 255, 204));
		panel_1_1_1_1_1.setBounds(523, 121, 462, 323);
		panel.add(panel_1_1_1_1_1);

		JLabel LabelTotalPrice = new JLabel("Total Price: ");
		LabelTotalPrice.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelTotalPrice.setBounds(25, 107, 137, 42);
		panel_1_1_1_1_1.add(LabelTotalPrice);

		JLabel LabelChanges = new JLabel("Changes: ");
		LabelChanges.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelChanges.setBounds(25, 216, 202, 42);
		panel_1_1_1_1_1.add(LabelChanges);

		textFieldChanges = new JTextField();
		textFieldChanges.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldChanges.setColumns(10);
		textFieldChanges.setBackground(Color.YELLOW);
		textFieldChanges.setBounds(25, 260, 411, 29);
		panel_1_1_1_1_1.add(textFieldChanges);

		JLabel LabelPriceAfterDiscount = new JLabel("Price After Discount: ");
		LabelPriceAfterDiscount.setBounds(25, 27, 202, 42);
		panel_1_1_1_1_1.add(LabelPriceAfterDiscount);
		LabelPriceAfterDiscount.setFont(new Font("Dialog", Font.BOLD, 20));

		textFieldPriceAfterDiscount = new JTextField();
		textFieldPriceAfterDiscount.setBounds(23, 68, 411, 29);
		panel_1_1_1_1_1.add(textFieldPriceAfterDiscount);
		textFieldPriceAfterDiscount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldPriceAfterDiscount.setColumns(10);
		textFieldPriceAfterDiscount.setBackground(Color.YELLOW);

		JTextField textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setBounds(25, 159, 411, 29);
		panel_1_1_1_1_1.add(textFieldTotalPrice);
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBackground(Color.YELLOW);

		JPanel panelBack = new JPanel();
		panelBack.setLayout(null);
		panelBack.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelBack.setBackground(Color.WHITE);
		panelBack.setBounds(1123, 615, 180, 68);
		panel.add(panelBack);

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
		panelEnter.setBounds(1123, 442, 180, 68);
		panel.add(panelEnter);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { textFieldNormalPrice.getText(), textFieldDiscountofProduct.getText(),
						textFieldPriceAfterDiscount.getText(), textFieldTotalPrice.getText(),
						textFieldPayment.getText(), textFieldChanges.getText(), });

				double normalprice;
				double discount;
				double priceafterdiscount;
				double totalprice;
				double payment;
				double changes;

				normalprice = Double.parseDouble(textFieldNormalPrice.getText());
				discount = Double.parseDouble(textFieldDiscountofProduct.getText());

				payment = Double.parseDouble(textFieldPayment.getText());
				priceafterdiscount = (normalprice * discount) / 100;
				totalprice = (normalprice - priceafterdiscount);
				changes = (payment - totalprice);
				textFieldPriceAfterDiscount.setText(Double.toString(priceafterdiscount));

				textFieldTotalPrice.setText(Double.toString(totalprice));
				textFieldChanges.setText(Double.toString(changes));

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Promotion Update confirmed", "Promotion Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setFont(new Font("Dialog", Font.BOLD, 25));
		btnEnter.setBackground(Color.RED);
		btnEnter.setBounds(10, 10, 160, 48);
		panelEnter.add(btnEnter);

		JPanel panelUpdate = new JPanel();
		panelUpdate.setLayout(null);
		panelUpdate.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelUpdate.setBackground(Color.WHITE);
		panelUpdate.setBounds(1123, 121, 180, 68);
		panel.add(panelUpdate);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.setValueAt(textFieldNormalPrice.getText(), i, 0);
					model.setValueAt(textFieldDiscountofProduct.getText(), i, 1);
					model.setValueAt(textFieldPriceAfterDiscount.getText(), i, 2);
					model.setValueAt(textFieldTotalPrice.getText(), i, 3);
					model.setValueAt(textFieldPayment.getText(), i, 4);
					model.setValueAt(textFieldPayment.getText(), i, 5);
					JOptionPane.showMessageDialog(null, "Update Successfully");
				} else {
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
		panelPrint.setBounds(1123, 222, 180, 68);
		panel.add(panelPrint);

		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent print) {
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
		panelDelete.setBounds(1123, 335, 180, 68);
		panel.add(panelDelete);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Promotion", JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Promotion System",
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

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 204));
		panel_2.setBounds(1050, 83, 308, 630);
		panel.add(panel_2);

		JPanel panelUpload = new JPanel();
		panelUpload.setLayout(null);
		panelUpload.setBorder(new LineBorder(Color.YELLOW, 5, true));
		panelUpload.setBackground(Color.WHITE);
		panelUpload.setBounds(860, 615, 180, 68);
		panel.add(panelUpload);

		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					File file = new File("C:\\Users\\USER\\eclipse-workspace\\Assignment3\\src\\Promotion.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < table.getRowCount(); i++) {
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
						bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Dialog", Font.BOLD, 25));
		btnUpload.setBackground(Color.RED);
		btnUpload.setBounds(10, 10, 160, 48);
		panelUpload.add(btnUpload);
	}
}
