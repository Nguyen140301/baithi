package entitis;

public class douutien {

	private int madouutien;
	private String tendouutien;
	public int getMadouutien() {
		return madouutien;
	}
	public void setMadouutien(int madouutien) {
		this.madouutien = madouutien;
	}
	public String getTendouutien() {
		return tendouutien;
	}
	public void setTendouutien(String tendouutien) {
		this.tendouutien = tendouutien;
	}
	public douutien(int madouutien, String tendouutien) {
		super();
		this.madouutien = madouutien;
		this.tendouutien = tendouutien;
	}
	public douutien() {
		super();
	}
	
}
