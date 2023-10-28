package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mindrot.jbcrypt.BCrypt;

import entitis.Nhanvien;
import model.Nhanvienmodel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jusername;
	private JPasswordField jpasswordField;
	private Map<String, Object> datanv = new HashMap<String, Object>();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(97, 40, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(97, 82, 70, 14);
		contentPane.add(lblPassword);
		
		jusername = new JTextField();
		jusername.setBounds(187, 37, 86, 20);
		contentPane.add(jusername);
		jusername.setColumns(10);
		
		jpasswordField = new JPasswordField();
		jpasswordField.setBounds(187, 79, 86, 20);
		contentPane.add(jpasswordField);
		
		JButton jlogin = new JButton("Login");
		jlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_jlogin_actionPerformed(e);
			}
		});
		jlogin.setBounds(187, 118, 89, 23);
		contentPane.add(jlogin);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(184, 166, 89, 23);
		contentPane.add(btnNewButton);
	}

	protected void do_jlogin_actionPerformed(ActionEvent e) {
		
		String username = jusername.getText().trim();
		String password = new String(jpasswordField.getPassword());
		Nhanvienmodel nhanvienmodel = new Nhanvienmodel();
		for (Nhanvien nhanvien : nhanvienmodel.filldAll()) {
			if(nhanvien.getUsername().equalsIgnoreCase(username)) {
				if(BCrypt.checkpw(password, nhanvien.getPassword())) {
					datanv.put("id", nhanvien.getId());
					trangchu trangchu = new trangchu(datanv);
					trangchu.setVisible(true);
					this.setVisible(false);
				}
			}
		}
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Signup signup = new Signup();
		signup.setVisible(true);
		this.setVisible(false);
	}
}
