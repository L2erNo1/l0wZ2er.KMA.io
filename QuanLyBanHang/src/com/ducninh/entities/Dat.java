package com.ducninh.entities;

import java.util.Date;

public class Dat extends ThongTin{
	private String loaiDat;
	
	public Dat() {
		// TODO Auto-generated constructor stub
	}

	public Dat(String diaChi, Date ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(diaChi, ngayGiaoDich, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		return "Dat [loaiDat=" + loaiDat + ", toString()=" + super.toString() + "]";
	}

	
}
