package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entitis.Nhanvien;

public class Nhanvienmodel {

	public List<Nhanvien> filldAll(){
		
		List<Nhanvien> nhanviens = new ArrayList<Nhanvien>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from nhanvien");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Nhanvien nhanvien = new Nhanvien();
				nhanvien.setId(resultSet.getInt("id"));
				nhanvien.setUsername(resultSet.getString("username"));
				nhanvien.setPassword(resultSet.getString("password"));
				nhanvien.setHovaten(resultSet.getString("hovaten"));
				nhanvien.setNgaysinh(resultSet.getDate("Ngaysinh"));
				
				nhanvien.setHinhanh(resultSet.getBytes("hinhanh"));
				nhanviens.add(nhanvien);
			}
		}catch( Exception e) {
			e.printStackTrace();
			nhanviens = null;
		}finally {
			ConnectDB.disconnect();
		}
		return nhanviens;
	}
	
	
	public boolean danaki(Nhanvien nhanvien ) {
		
		boolean result = true;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("insert into nhanvien(id, username, password, hovaten, ngaysinh, hinhanh) values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, nhanvien.getId());
			preparedStatement.setString(2, nhanvien.getUsername());
			preparedStatement.setString(3, nhanvien.getPassword());
			preparedStatement.setString(4, nhanvien.getHovaten());
			preparedStatement.setDate(5, new java.sql.Date(nhanvien.getNgaysinh().getTime()));
			preparedStatement.setBytes(6, nhanvien.getHinhanh());
			result = preparedStatement.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}finally {
			ConnectDB.disconnect();
		}
		return result;
		
	}
	
public Nhanvien seach(int id){
	Nhanvien nhanvien = new Nhanvien();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from nhanvien where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				nhanvien.setId(resultSet.getInt("id"));
				nhanvien.setUsername(resultSet.getString("username"));
				nhanvien.setPassword(resultSet.getString("password"));
				nhanvien.setHovaten(resultSet.getString("hovaten"));
				nhanvien.setNgaysinh(resultSet.getDate("Ngaysinh"));
				nhanvien.setHinhanh(resultSet.getBytes("hinhanh"));
				
			}
		}catch( Exception e) {
			e.printStackTrace();
			
		}finally {
			ConnectDB.disconnect();
		}
		return nhanvien;
	}
}
	
