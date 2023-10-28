package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitis.Yeucau;

public class Yeucaumodel {

public List<Yeucau> filldAll(){
		
		List<Yeucau> yeucaus = new ArrayList<Yeucau>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from yeucau");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Yeucau yeucau = new Yeucau();
				yeucau.setMayeucau(resultSet.getInt("mayeucau"));
				yeucau.setTieude(resultSet.getString("tieude"));
				yeucau.setNoidung(resultSet.getString("noidung"));
				yeucau.setNgaygui(resultSet.getDate("ngaygui"));
				yeucau.setMadouutien(resultSet.getInt("madouutien"));
				yeucau.setManvgui(resultSet.getInt("manv_gui"));
				yeucau.setManvxy(resultSet.getInt("manv_xuly"));
				
				yeucaus.add(yeucau);
			}
		}catch( Exception e) {
			e.printStackTrace();
			yeucaus = null;
		}finally {
			ConnectDB.disconnect();
		}
		return yeucaus;
	}
	
	
	public boolean gui(Yeucau yeucau ) {
		
		boolean result = true;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("insert into yeucau(mayeucau, tieude, noidung, ngaygui, madouutien, manv_gui, manv_xuly) values(?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, yeucau.getMayeucau());
			preparedStatement.setString(2, yeucau.getTieude());
			preparedStatement.setString(3, yeucau.getNoidung());
			preparedStatement.setDate(4, new java.sql.Date( yeucau.getNgaygui().getTime()));
			preparedStatement.setInt(5,yeucau.getMadouutien());
			preparedStatement.setInt(6, yeucau.getManvgui());
			preparedStatement.setInt(7, yeucau.getManvxy());
			result = preparedStatement.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			ConnectDB.disconnect();
		}
		return result;
		
	}
	
		public List<Yeucau>  searchdate(Date id) {
		List<Yeucau> yeucaus = new ArrayList<Yeucau>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from yeucau where ngaygui = ? ");
			
			preparedStatement.setDate(1, new java.sql.Date(id.getTime()));
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Yeucau yeucau=new Yeucau();
				yeucau.setMayeucau(resultSet.getInt("mayeucau"));				
				yeucau.setTieude(resultSet.getString("tieude"));
				yeucau.setNoidung(resultSet.getString("noidung"));
			    yeucau.setManvgui(resultSet.getInt("manv_gui"));
				yeucau.setNgaygui(resultSet.getDate("ngaygui"));
				yeucau.setMadouutien(resultSet.getInt("madouutien"));
				yeucaus.add(yeucau);
			}
			ConnectDB.disconnect();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return yeucaus;
		
	}
//	public List<Yeucau>  searchuutien(int id) {
//		List<Yeucau> yeucaus = new ArrayList<Yeucau>();
//		try {
//			PreparedStatement preparedStatement=ConnectDB.connection()
//					.prepareStatement("select * from yeucau where madouutien=?");
//			
//			preparedStatement.setInt(1, id);;
//			ResultSet resultSet=preparedStatement.executeQuery();
//			while(resultSet.next()) {
//				Yeucau yeucau=new Yeucau();
//				yeucau.setMayeucau(resultSet.getString("mayeucau"));
//				yeucau.setTieude(resultSet.getString("tieude"));
//				yeucau.setNoidung(resultSet.getString("noidung"));
//			    yeucau.setManv_gui(resultSet.getInt("manv_gui"));
//				yeucau.setNgaygui(resultSet.getDate("ngaygui"));
//				yeucau.setMadouutien(resultSet.getInt("madouutien"));
//				yeucaus.add(yeucau);
//			}
//			ConnecDB.disconnect();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return yeucaus;
//		
//	}
	public List<Yeucau>  search(int id) {
		List<Yeucau> yeucaus = new ArrayList<Yeucau>();
		try {
			PreparedStatement preparedStatement=ConnectDB.connection()
					.prepareStatement("select * from yeucau where manv_gui=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Yeucau yeucau=new Yeucau();
				yeucau.setMayeucau(resultSet.getInt("mayeucau"));
				yeucau.setTieude(resultSet.getString("tieude"));
				yeucau.setNoidung(resultSet.getString("noidung"));
			    yeucau.setManvgui(resultSet.getInt("manv_gui"));
				yeucau.setNgaygui(resultSet.getDate("ngaygui"));
				yeucau.setMadouutien(resultSet.getInt("madouutien"));
				yeucaus.add(yeucau);
			}
			ConnectDB.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return yeucaus;
		
	}
	
}
