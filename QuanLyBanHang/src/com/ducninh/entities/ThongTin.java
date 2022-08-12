package com.ducninh.entities;

import java.util.Date;

public class ThongTin {
	private String diaChi;
	private Date ngayGiaoDich;
	private double donGia;
	private double dienTich;
	
	public ThongTin() {
		// TODO Auto-generated constructor stub
	}

	public ThongTin(String diaChi, Date ngayGiaoDich, double donGia, double dienTich) {
		super();
		this.diaChi = diaChi;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	@Override
	public String toString() {
		return "ThongTin [diaChi=" + diaChi + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich="
				+ dienTich + "]";
	}
	
}
