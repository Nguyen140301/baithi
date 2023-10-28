package entitis;

import java.util.Date;

public class Yeucau {
	
	private	 int mayeucau;
	private String tieude;
	private String noidung;
	private Date ngaygui;
	private int madouutien;
	private int manvgui;
	private int manvxy;
	public int getMayeucau() {
		return mayeucau;
	}
	public void setMayeucau(int mayeucau) {
		this.mayeucau = mayeucau;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Date getNgaygui() {
		return ngaygui;
	}
	public void setNgaygui(Date ngaygui) {
		this.ngaygui = ngaygui;
	}
	public int getMadouutien() {
		return madouutien;
	}
	public void setMadouutien(int madouutien) {
		this.madouutien = madouutien;
	}
	public int getManvgui() {
		return manvgui;
	}
	public void setManvgui(int manvgui) {
		this.manvgui = manvgui;
	}
	public int getManvxy() {
		return manvxy;
	}
	public void setManvxy(int manvxy) {
		this.manvxy = manvxy;
	}
	public Yeucau(int mayeucau, String tieude, String noidung, Date ngaygui, int madouutien, int manvgui, int manvxy) {
		super();
		this.mayeucau = mayeucau;
		this.tieude = tieude;
		this.noidung = noidung;
		this.ngaygui = ngaygui;
		this.madouutien = madouutien;
		this.manvgui = manvgui;
		this.manvxy = manvxy;
	}
	public Yeucau() {
		super();
	}
	
	

}
