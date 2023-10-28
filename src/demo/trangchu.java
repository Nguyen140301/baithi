package demo;

import java.awt.EventQueue;
import java.awt.Panel;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import entitis.Yeucau;
import model.Yeucaumodel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class trangchu extends JFrame {
	private Map<String, Object>datanvv = new HashMap<String, Object>() ;
	private static final long serialVersionUID = 1L;
	private static final Yeucau Yeucau = null;
	private JPanel contentPane;
	private JTextField jtieude;
	private JComboBox jcomboBoxmadouutien;
	private JDateChooser jdateChoosernagygui;
	private JTextArea jnoidung;
	private JPanel jpanel1;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trangchu frame = new trangchu();
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
	public trangchu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 553);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 128));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("Thong tin");
		btnNewButton.setForeground(new Color(0, 0, 64));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gui yeu cau");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		panel.add(btnNewButton_1);
		
		btnNewButton_5 = new JButton("xemyeucau");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_5_actionPerformed(e);
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("thoat");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_3_actionPerformed(e);
			}
		});
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		panel.add(btnNewButton_3);
		
		jpanel1 = new JPanel();
		jpanel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(jpanel1, BorderLayout.CENTER);
		jpanel1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 5, 625, 21);
		jpanel1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Trang chu");
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblPassword = new JLabel("Tieude");
		lblPassword.setBounds(116, 86, 64, 14);
		jpanel1.add(lblPassword);
		
		JLabel lblHovaten = new JLabel("Noidung");
		lblHovaten.setBounds(116, 115, 64, 14);
		jpanel1.add(lblHovaten);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(69, 140, 64, 14);
		jpanel1.add(lblNewLabel_3);
		
		JLabel lblNgaygui = new JLabel("Ngaygui");
		lblNgaygui.setBounds(116, 165, 64, 14);
		jpanel1.add(lblNgaygui);
		
		JLabel lblDoUuTien = new JLabel("Madouutien");
		lblDoUuTien.setBounds(116, 205, 64, 14);
		jpanel1.add(lblDoUuTien);
		
		jcomboBoxmadouutien = new JComboBox();
		jcomboBoxmadouutien.setBounds(221, 201, 128, 22);
		jpanel1.add(jcomboBoxmadouutien);
		
		jdateChoosernagygui = new JDateChooser();
		jdateChoosernagygui.setBounds(221, 164, 128, 20);
		jpanel1.add(jdateChoosernagygui);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 109, 128, 45);
		jpanel1.add(scrollPane);
		
		jnoidung = new JTextArea();
		scrollPane.setViewportView(jnoidung);
		
		jtieude = new JTextField();
		jtieude.setBounds(221, 83, 128, 20);
		jpanel1.add(jtieude);
		jtieude.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("gui");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_4_actionPerformed(e);
			}
		});
		
		btnNewButton_4.setBounds(218, 245, 131, 23);
		jpanel1.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("quaylaiguiyeucau");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_2_actionPerformed(e);
			}
		});
		btnNewButton_2.setBounds(221, 289, 128, 23);
		jpanel1.add(btnNewButton_2);
		
		initJFrame();
	}

	public void initJFrame() {
		DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<Integer>();
		model.addElement(1);
		model.addElement(2);
		model.addElement(3);
		model.addElement(4);
		jcomboBoxmadouutien.setModel(model);
	}

	public trangchu(Map<String , Object> datanv) {
		this();
		datanvv = datanv;
		
		
		initJFrame();
	}
	
	
	
	
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		Yeucaumodel yeucaumodel = new Yeucaumodel();
		int ma= (int)datanvv.get("id");
		Yeucau yeucau = new Yeucau();
		yeucau.setTieude(jtieude.getText());
		yeucau.setNoidung(jnoidung.getText());
		yeucau.setNgaygui(jdateChoosernagygui.getDate());
		yeucau.setMadouutien(jcomboBoxmadouutien.getSelectedIndex());
		yeucau.setManvgui( ma);
		if(yeucaumodel.gui(yeucau)){
			JOptionPane.showMessageDialog(null, "ok e yeu");
		}else {
			JOptionPane.showMessageDialog(null, "ko e yeu");
		}
	}
	protected void do_btnNewButton_5_actionPerformed(ActionEvent e) {
		Xemyeucau xemyeucau = new Xemyeucau(datanvv);
		jpanel1.removeAll();
		jpanel1.revalidate();
		jpanel1.setLayout(new BorderLayout(0, 0));
		jpanel1.add(xemyeucau);
		jpanel1.setVisible(true);
		
		
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		Login dn = new Login();
		dn.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		trangchu trangchu = new trangchu(datanvv);
		trangchu.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		
	}
}
