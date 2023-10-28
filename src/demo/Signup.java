package demo;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.mindrot.jbcrypt.BCrypt;

import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import entitis.Nhanvien;
import model.Nhanvienmodel;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField jpassword;
	private JTextField jname;
	private JTextField jhovaten;
	private JPanel jhinhanh;
	private File selectedFile;
	private JDateChooser jdateChooser;
	private JButton btnNewButton;
	private JButton jdangki;
	private JTextField jkichhoat;
	private JButton btnLoGin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(33, 11, 56, 14);
		contentPane.add(lblNewLabel);
		
		jpassword = new JPasswordField();
		jpassword.setBounds(116, 39, 86, 20);
		contentPane.add(jpassword);
		
		JLabel lblNewLabel_1 = new JLabel("Ho va ten");
		lblNewLabel_1.setBounds(33, 67, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ngay sinh");
		lblNewLabel_2.setBounds(33, 92, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kich hoat");
		lblNewLabel_2_1.setBounds(33, 117, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hinh anh");
		lblNewLabel_2_2.setBounds(33, 142, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		jname = new JTextField();
		jname.setBounds(116, 8, 86, 20);
		contentPane.add(jname);
		jname.setColumns(10);
		
		jhovaten = new JTextField();
		jhovaten.setColumns(10);
		jhovaten.setBounds(116, 64, 86, 20);
		contentPane.add(jhovaten);
		
		jkichhoat = new JTextField();
		jkichhoat.setColumns(10);
		jkichhoat.setBounds(116, 114, 86, 20);
		contentPane.add(jkichhoat);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(33, 36, 56, 14);
		contentPane.add(lblPassword);
		
		jdangki = new JButton("Signup");
		jdangki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_jdangki_actionPerformed(e);
			}
		});
		
		jdangki.setBounds(116, 189, 89, 23);
		contentPane.add(jdangki);
		
		jhinhanh = new JPanel();
		jhinhanh.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jhinhanh.setBounds(116, 142, 86, 36);
		contentPane.add(jhinhanh);
		
		btnNewButton = new JButton("Chon hinh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(217, 155, 89, 23);
		contentPane.add(btnNewButton);
		
		jdateChooser = new JDateChooser();
		jdateChooser.setBounds(116, 86, 86, 20);
		contentPane.add(jdateChooser);
		
		btnLoGin = new JButton("Login");
		btnLoGin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnLoGin_actionPerformed(e);
			}
		});
		btnLoGin.setBounds(217, 189, 89, 23);
		contentPane.add(btnLoGin);
	}
	
	private void initJFrame() {
		Nhanvienmodel nhanvienmodels = new Nhanvienmodel();
		for(Nhanvien nhanvien : nhanvienmodels.filldAll()) {
			
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		JFileChooser jFileChooser = new JFileChooser("C\\");
		jFileChooser.setDialogTitle("select a hinhanh");
		jFileChooser.setMultiSelectionEnabled(false);
		int result = jFileChooser.showOpenDialog(null);
		if( result == jFileChooser.APPROVE_OPTION) {
			selectedFile = jFileChooser.getSelectedFile();
			int width = jhinhanh.getWidth();
			int height = jhinhanh.getHeight();
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(selectedFile.getAbsolutePath()).getImage()
					.getScaledInstance(width, height, Image.SCALE_DEFAULT));
			
		}
	}
	protected void do_jdangki_actionPerformed(ActionEvent e) {
		
		
		try {
			Nhanvienmodel nhanvienmodel = new Nhanvienmodel();
			Nhanvien nhanvien = new Nhanvien() ;
			nhanvien.setNgaysinh(jdateChooser.getDate());
			nhanvien.setHovaten(jhovaten.getText());
			nhanvien.setKichhoat(jkichhoat.getAutoscrolls());
			nhanvien.setUsername(jname.getText());
			String password = new String(jpassword.getPassword());
			nhanvien.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
			nhanvien.setHinhanh(Files.readAllBytes(Paths.get(selectedFile.getAbsolutePath())));
			if(nhanvienmodel.danaki(nhanvien)) {
				JOptionPane.showMessageDialog(null, "ok");
			}else {
				JOptionPane.showMessageDialog(null, "kh nha");
			}
			
		} catch (Exception e2) {
			
		}
	}
	
	protected void do_btnLoGin_actionPerformed(ActionEvent e) {
		Login login = new Login();
		login.setVisible(true);
		this.setVisible(false);
	}
}
