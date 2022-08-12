package com.ducninh.entities;

import java.util.Date;

public class Nha extends ThongTin{
	private String loaiNha;
	
	public Nha() {
		
	}

	public Nha(String diaChi, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha) {
		super(diaChi, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	@Override
	public String toString() {
		return "Nha [loaiNha=" + loaiNha + ", toString()=" + super.toString() + "]";
	}
	
}
