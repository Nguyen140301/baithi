package entitis;

import java.util.Date;

public class Nhanvien {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String username;
	private String password;
	private String hovaten;
	private Date ngaysinh;
	private boolean kichhoat ;
	private byte[]  hinhanh;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public boolean isKichhoat() {
		return kichhoat;
	}
	public void setKichhoat(boolean kichhoat) {
		this.kichhoat = kichhoat;
	}
	public byte[] getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(byte[] hinhanh) {
		this.hinhanh = hinhanh;
	}
	public Nhanvien(String username, String password, String hovaten, Date ngaysinh, boolean kichhoat, byte[] hinhanh) {
		super();
		this.username = username;
		this.password = password;
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.kichhoat = kichhoat;
		this.hinhanh = hinhanh;
	}
	public Nhanvien() {
		super();
	}
	
	
}
