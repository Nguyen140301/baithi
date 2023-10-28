package demo;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sua extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public sua() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(60, 24, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(60, 62, 46, 14);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(60, 99, 46, 14);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(161, 21, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 59, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(161, 96, 86, 20);
		panel.add(textField_2);

	}

}
