import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class AddData {
	private JFrame frame = new JFrame("Add Data");
	private JLabel fnameLabel = new JLabel("First Name");
	private JLabel mnameLabel = new JLabel("Middle Name");
	private JLabel lnameLabel = new JLabel("Last Name");
	private JLabel ageLabel = new JLabel("Age");
	private JLabel emailLabel = new JLabel("Email");
	private JTextField fnameField = new JTextField(20);
	private JTextField mnameField = new JTextField(20);
	private JTextField lnameField = new JTextField(20);
	private JTextField ageField = new JTextField(20);
	private JTextField emailField = new JTextField(20);
	private JButton addDataButton = new JButton("Add");

	public void printData() {
		
		addDataButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String fname,mname,lname,email;
				int age;
				
			
				if(fnameField.getText().length() == 0 || 
						mnameField.getText().length() == 0 || 
						lnameField.getText().length() == 0 || 
						ageField.getText().length() == 0 || 
						emailField.getText().length() == 0 ) {
					JOptionPane.showMessageDialog(null, "Please complete the form", "Empty Field", JOptionPane.WARNING_MESSAGE);
					
				}else { 
					fname = fnameField.getText();
					mname = mnameField.getText();
					lname = lnameField.getText();
					age = Integer.parseInt(ageField.getText());
					email = emailField.getText();
					
					String row[] = {fname, mname, lname, age+"", email};
					DefaultTableModel model = (DefaultTableModel) Main.dataTable.getModel();
					model.addRow(row);
					frame.setVisible(false);

				}
						
			}});
		
		fnameLabel.setBounds(60, 60, 100, 40);
		mnameLabel.setBounds(60, 160, 100, 40);
		lnameLabel.setBounds(60, 260, 100, 40);
		ageLabel.setBounds(60, 360, 100, 40);
		emailLabel.setBounds(60, 460, 100, 40);
		fnameField.setBounds(220,60,200,40);
		mnameField.setBounds(220,160,200,40);
		lnameField.setBounds(220,260,200,40);
		ageField.setBounds(220,360,200,40);
		emailField.setBounds(220,460,200,40);
		addDataButton.setBounds(440,60,100,40);
		
		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		
		frame.add(fnameLabel);
		frame.add(mnameLabel);	
		frame.add(lnameLabel);
		frame.add(ageLabel);
		frame.add(emailLabel);
		frame.add(fnameField);
		frame.add(mnameField);
		frame.add(lnameField);
		frame.add(ageField);
		frame.add(emailField);
		frame.add(addDataButton);
	}
	
}