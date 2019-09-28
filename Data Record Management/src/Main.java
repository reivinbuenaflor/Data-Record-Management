import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class Main{
	public static JTable dataTable = new JTable();
	public static void main(String[] args) {
		JFrame frame = new JFrame("Data Record Management");
		JButton addButton = new JButton("Add");
		JButton deleteButton = new JButton("Delete");
		JButton searchButton = new JButton("Search");
		JTextField searchField = new JTextField(20);
		JScrollPane tablePane = new JScrollPane(dataTable); 
		dataTable.setModel(new DefaultTableModel(
				new String[][] {},
				new String[] {
				"First Name",
				"Middle Name",
				"Last Name",
				"Age",
				"Email"}));
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddData addData = new AddData(); 
				addData.printData();
			}});
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = dataTable.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
				if(selectedRow < 0) {
					JOptionPane.showMessageDialog(null, "Please select a row to delete","No Selected Row",JOptionPane.ERROR_MESSAGE);
				}else {
					model.removeRow(selectedRow);
					
				}
				
			}});
		/*searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String search;
				search = searchField.getText();
				if(searchField.getText().trim().length()==0) {
					JOptionPane.showMessageDialog(null, "Please type a name", "Empty Field", JOptionPane.WARNING_MESSAGE);
				}else {
					String names[] = {search};
					if(searchField.getText().toLowerCase()== names.toString().toLowerCase()|| searchField.getText().toUpperCase()== names.toString().toUpperCase()) {
						
					}
				}
				
			}});*/
		
		addButton.setBounds(30, 50, 130, 40);
		deleteButton.setBounds(190, 50, 130, 40);
		//searchField.setBounds(410, 50, 200, 40);
		//searchButton.setBounds(630, 50, 130, 40);
		dataTable.setBounds(100, 10, 100, 200);
		tablePane.setBounds(30, 100, 730, 430);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.add(addButton);
		frame.add(deleteButton);
		//frame.add(searchField);
		//frame.add(searchButton);
		frame.add(tablePane);
	}
}