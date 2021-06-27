import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Employees1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldName;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldPosition;
	private JTextField textFieldMonthSalary;
	private JTextField textFieldNumberofDaysWork;
	private JTextField textFieldNumbersofDayMonth;
	private JTable table;
	private JTextField textFieldTotalsalary;
	private JTextField textFieldTotalNetSalary;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees1 frame = new Employees1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Employees1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(34, 139, 34), 10, true));
		panel.setBounds(0, 0, 1341, 722);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(34, 139, 34), 10, true));
		panel_1.setBackground(new Color(255, 255, 102));
		panel_1.setBounds(24, 528, 854, 165);
		panel.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 834, 108);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Phone Number ", "Position", "Month Salary", "Number of Days Work", "Number of Day Month"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panelEmployeeInformation = new JPanel();
		panelEmployeeInformation.setLayout(null);
		panelEmployeeInformation.setBorder(new LineBorder(new Color(34, 139, 34), 10, true));
		panelEmployeeInformation.setBackground(new Color(255, 255, 102));
		panelEmployeeInformation.setBounds(24, 182, 410, 336);
		panel.add(panelEmployeeInformation);
		
		JLabel LabelID = new JLabel("ID: ");
		LabelID.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelID.setBounds(24, 102, 177, 44);
		panelEmployeeInformation.add(LabelID);
		
		JLabel Labelname = new JLabel("Name: ");
		Labelname.setFont(new Font("Dialog", Font.BOLD, 20));
		Labelname.setBounds(24, 156, 177, 33);
		panelEmployeeInformation.add(Labelname);
		
		JLabel LabelPhoneNumber = new JLabel("Phone Number: ");
		LabelPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelPhoneNumber.setBounds(24, 199, 177, 52);
		panelEmployeeInformation.add(LabelPhoneNumber);
		
		JLabel LabelPosition = new JLabel("Position: ");
		LabelPosition.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelPosition.setBounds(24, 261, 177, 46);
		panelEmployeeInformation.add(LabelPosition);
		
		JLabel LabelEmployeeInformation = new JLabel(" EMPLOYEE INFORMATION");
		LabelEmployeeInformation.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEmployeeInformation.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		LabelEmployeeInformation.setBounds(24, 23, 365, 33);
		panelEmployeeInformation.add(LabelEmployeeInformation);
		
		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		textFieldID.setBounds(56, 112, 329, 33);
		panelEmployeeInformation.add(textFieldID);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(88, 160, 301, 33);
		panelEmployeeInformation.add(textFieldName);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(180, 214, 209, 31);
		panelEmployeeInformation.add(textFieldPhoneNumber);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(116, 275, 273, 28);
		panelEmployeeInformation.add(textFieldPosition);
		
		JPanel panelSalary = new JPanel();
		panelSalary.setLayout(null);
		panelSalary.setBorder(new LineBorder(new Color(34, 139, 34), 10, true));
		panelSalary.setBackground(new Color(255, 255, 102));
		panelSalary.setBounds(469, 182, 410, 336);
		panel.add(panelSalary);
		
		JLabel LabelSalary = new JLabel("SALARY");
		LabelSalary.setHorizontalAlignment(SwingConstants.CENTER);
		LabelSalary.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		LabelSalary.setBounds(102, 20, 177, 51);
		panelSalary.add(LabelSalary);
		
		JLabel LabelMonthSalary = new JLabel("Month Salary: ");
		LabelMonthSalary.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelMonthSalary.setBounds(22, 66, 157, 32);
		panelSalary.add(LabelMonthSalary);
		
		JLabel LabelNumberofDaysWork = new JLabel("Numbers of Days Work: ");
		LabelNumberofDaysWork.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelNumberofDaysWork.setBounds(22, 152, 229, 32);
		panelSalary.add(LabelNumberofDaysWork);
		
		JLabel LabelNumbersofDayMonth = new JLabel("Numbers of Day Month: ");
		LabelNumbersofDayMonth.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelNumbersofDayMonth.setBounds(22, 236, 229, 32);
		panelSalary.add(LabelNumbersofDayMonth);
		
		textFieldMonthSalary = new JTextField();
		textFieldMonthSalary.setColumns(10);
		textFieldMonthSalary.setBounds(22, 110, 363, 32);
		panelSalary.add(textFieldMonthSalary);
		
		textFieldNumberofDaysWork = new JTextField();
		textFieldNumberofDaysWork.setColumns(10);
		textFieldNumberofDaysWork.setBounds(22, 194, 363, 32);
		panelSalary.add(textFieldNumberofDaysWork);
		
		textFieldNumbersofDayMonth = new JTextField();
		textFieldNumbersofDayMonth.setColumns(10);
		textFieldNumbersofDayMonth.setBounds(22, 278, 363, 32);
		panelSalary.add(textFieldNumbersofDayMonth);
		
		JPanel panelUpdate = new JPanel();
		panelUpdate.setLayout(null);
		panelUpdate.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelUpdate.setBackground(new Color(255, 255, 102));
		panelUpdate.setBounds(1133, 347, 180, 68);
		panel.add(panelUpdate);
		
		JButton btnUpdate = new JButton("UPDATE");
	btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldID.getText(),i,0);
			    	model.setValueAt(textFieldName.getText(),i,1);
			    	model.setValueAt(textFieldPhoneNumber.getText(),i,2);
			    	model.setValueAt(textFieldPosition.getText(),i,3);
			    	model.setValueAt(textFieldMonthSalary.getText(),i,4); 
			    	model.setValueAt(textFieldNumberofDaysWork.getText(),i,5);     
			    	model.setValueAt(textFieldNumbersofDayMonth.getText(),i,6);     
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
		btnUpdate.setBackground(new Color(255, 255, 102));
		btnUpdate.setBounds(10, 10, 160, 48);
		panelUpdate.add(btnUpdate);
		
		JPanel panelDelete = new JPanel();
		panelDelete.setLayout(null);
		panelDelete.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelDelete.setBackground(new Color(255, 255, 102));
		panelDelete.setBounds(1133, 269, 180, 68);
		panel.add(panelDelete);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"EmployeeManagement System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 25));
		btnDelete.setBackground(new Color(255, 255, 102));
		btnDelete.setBounds(10, 10, 160, 48);
		panelDelete.add(btnDelete);
		
		JPanel panelEnter = new JPanel();
		panelEnter.setLayout(null);
		panelEnter.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelEnter.setBackground(new Color(255, 255, 102));
		panelEnter.setBounds(1133, 191, 180, 68);
		panel.add(panelEnter);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldID.getText(),
						textFieldName.getText(),
						textFieldPhoneNumber.getText(),
						textFieldPosition.getText(),
						textFieldMonthSalary.getText(),
						textFieldNumberofDaysWork.getText(),
						textFieldNumbersofDayMonth.getText(),
			
				});
				double MonthSalary; 
				double NumberofDayWork;
				double NumbersofDayMonth;
				double Tax;
				double totalsalary;
				double TotalNetSalary;
				
				 MonthSalary = Double.parseDouble(textFieldMonthSalary.getText());
				 NumberofDayWork = Double.parseDouble(textFieldNumberofDaysWork.getText());
			
				 NumbersofDayMonth= Double.parseDouble(textFieldNumbersofDayMonth.getText());
				 
					totalsalary=(MonthSalary* NumberofDayWork )/NumbersofDayMonth;
					Tax = totalsalary*0.1;
					TotalNetSalary=totalsalary-Tax;
					textFieldTotalsalary.setText(Double.toString(totalsalary));
					
					
					textFieldTotalNetSalary.setText(Double.toString(TotalNetSalary));
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(255, 255, 102));
		btnNewButton.setBounds(10, 10, 160, 48);
		panelEnter.add(btnNewButton);
		
		JPanel panelEmployesstopic = new JPanel();
		panelEmployesstopic.setLayout(null);
		panelEmployesstopic.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelEmployesstopic.setBackground(new Color(255, 255, 102));
		panelEmployesstopic.setBounds(24, 30, 1295, 142);
		panel.add(panelEmployesstopic);
		
		JLabel LabelEmployees = new JLabel("EMPLOYEES");
		LabelEmployees.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEmployees.setForeground(Color.RED);
		LabelEmployees.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 60));
		LabelEmployees.setBackground(new Color(255, 255, 102));
		LabelEmployees.setBounds(26, 22, 1245, 95);
		panelEmployesstopic.add(LabelEmployees);
		
		JPanel panelBack = new JPanel();
		panelBack.setLayout(null);
		panelBack.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelBack.setBackground(new Color(255, 255, 102));
		panelBack.setBounds(914, 347, 180, 68);
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
		btnBack.setBackground(new Color(255, 255, 102));
		btnBack.setBounds(10, 10, 160, 48);
		panelBack.add(btnBack);
		
		JPanel panelPrint = new JPanel();
		panelPrint.setLayout(null);
		panelPrint.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelPrint.setBackground(new Color(255, 255, 102));
		panelPrint.setBounds(914, 269, 180, 68);
		panel.add(panelPrint);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());}
				
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPrint.setBackground(new Color(255, 255, 102));
		btnPrint.setBounds(10, 10, 160, 48);
		panelPrint.add(btnPrint);
		
		JPanel panelEnter_1 = new JPanel();
		panelEnter_1.setLayout(null);
		panelEnter_1.setBorder(new LineBorder(new Color(34, 139, 34), 5, true));
		panelEnter_1.setBackground(new Color(255, 255, 102));
		panelEnter_1.setBounds(914, 191, 180, 68);
		panel.add(panelEnter_1);
		
		JButton btnUpload= new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
				File file = new File("C:\\Users\\USER\\eclipse-workspace\\Assignment3\\src\\Employees1.txt");
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
		btnUpload.setBackground(new Color(255, 255, 102));
		btnUpload.setBounds(10, 10, 160, 48);
		panelEnter_1.add(btnUpload);
		
		JPanel panelSalary_1 = new JPanel();
		panelSalary_1.setLayout(null);
		panelSalary_1.setBorder(new LineBorder(new Color(34, 139, 34), 10, true));
		panelSalary_1.setBackground(new Color(255, 255, 102));
		panelSalary_1.setBounds(914, 425, 399, 269);
		panel.add(panelSalary_1);
		
		JLabel LabelTotalSalary = new JLabel("Total Salary: ");
		LabelTotalSalary.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelTotalSalary.setBounds(22, 66, 157, 32);
		panelSalary_1.add(LabelTotalSalary);
		
		JLabel LabelTotalNetSalary = new JLabel("TotalNetSalary: ");
		LabelTotalNetSalary.setFont(new Font("Dialog", Font.BOLD, 20));
		LabelTotalNetSalary.setBounds(22, 152, 229, 32);
		panelSalary_1.add(LabelTotalNetSalary);
		
		textFieldTotalsalary = new JTextField();
		textFieldTotalsalary.setColumns(10);
		textFieldTotalsalary.setBounds(22, 110, 363, 32);
		panelSalary_1.add(textFieldTotalsalary);
		
		textFieldTotalNetSalary = new JTextField();
		textFieldTotalNetSalary.setColumns(10);
		textFieldTotalNetSalary.setBounds(22, 194, 363, 32);
		panelSalary_1.add(textFieldTotalNetSalary);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\Saved Pictures\\Wallpaper2.jpg"));
		lblNewLabel.setBounds(10, 7, 1321, 705);
		panel.add(lblNewLabel);
	}
}
