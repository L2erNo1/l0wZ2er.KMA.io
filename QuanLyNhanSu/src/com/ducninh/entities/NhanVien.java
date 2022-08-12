package com.ducninh.entities;

public class NhanVien {

	private String hoTen;
	private String phai;
	private int tuoi;
	private String chucVu;
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, String phai, int tuoi, String chucVu) {
		super();
		this.hoTen = hoTen;
		this.phai = phai;
		this.tuoi = tuoi;
		this.chucVu = chucVu;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
		this.phai = phai;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public String toString() {
		return "NhanVien [hoTen=" + hoTen + ", phai=" + phai + ", tuoi=" + tuoi + ", chucVu=" + chucVu + "]";
	}
	
	
	
}
