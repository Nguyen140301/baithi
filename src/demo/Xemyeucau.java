package demo;


import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.IDateEditor;

import entitis.Nhanvien;
import entitis.Yeucau;
import model.Nhanvienmodel;
import model.Yeucaumodel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Xemyeucau extends JPanel {
	private Map<String, Object> data = new HashMap<String, Object>();
	private JTable table;
	private JButton jSeach;
	private JDateChooser jdateChooser;

	/**
		 * Create the panel.
		 */
		public Xemyeucau() {
			setLayout(new BorderLayout(0, 0));
			
			JPanel panel = new JPanel();
			add(panel, BorderLayout.NORTH);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			
			JLabel lblNewLabel = new JLabel("Search");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			panel.add(lblNewLabel);
			
			jdateChooser = new JDateChooser();
			jdateChooser.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					do_dateChooser_keyReleased(e);
				}
			});
			panel.add(jdateChooser);
			
			jSeach = new JButton("Seach");
			jSeach.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_jSeach_actionPerformed(e);
				}
			});
			panel.add(jSeach);
			
			JPanel panel_1 = new JPanel();
			add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			panel_1.add(scrollPane, BorderLayout.CENTER);
			
			table = new JTable();
			scrollPane.setViewportView(table);
	 
		}

	public Xemyeucau(Map<String, Object> object) {
		this();
			 data = object;
			
	        intFrame((int) data.get("id"));
		}

	private void intFrame(int id) {
		DefaultTableModel model = new DefaultTableModel();
		Yeucaumodel yeucauModel = new Yeucaumodel();
		filldata(yeucauModel.search(id));
	}

	protected void do_dateChooser_keyReleased(KeyEvent e) {

	}

	private void filldata(List<Yeucau> yeucaus) {
		DefaultTableModel model = new DefaultTableModel();
		Yeucaumodel yeucauModel = new Yeucaumodel();
		model.addColumn("mayeucau");
		model.addColumn("tieude");
		model.addColumn("noidung");
		model.addColumn("ngaygui");
		model.addColumn("madouutien");
		model.addColumn("manv_xl");
		for (Yeucau yeucau : yeucaus) {
			model.addRow(new Object[] { yeucau.getMayeucau(), yeucau.getTieude(), yeucau.getNoidung(),
					yeucau.getNgaygui(), yeucau.getMadouutien(), yeucau.getManvxy(), });

		}
		table.setModel(model);

	}
	protected void do_jSeach_actionPerformed(ActionEvent e) {
		Yeucaumodel yeucaumodel = new Yeucaumodel();
		List<Yeucau> yeucau = yeucaumodel.searchdate(jdateChooser.getDate());
		filldata(yeucau);
	}
}
