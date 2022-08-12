package com.ducninh.ui;

import com.ducninh.entities.NhanVien;
import com.ducninh.management.Management;
import com.ducninh.repository.GenericRepository;
import com.ducninh.repository.ipl.NhanVienRepository;

class ThreadNV implements Runnable{

	@Override
	public void run() {
		GenericRepository<NhanVien> iNV = new NhanVienRepository();
		Management<NhanVien> nv = new Management<>(iNV);
		
		NhanVien nv1 = new NhanVien("Ninh", "Nam", 22, "Quan Ly");
		NhanVien nv2 = new NhanVien("Binh", "Nu", 46, "Truong Phong");
		NhanVien nv3 = new NhanVien("Phuoc", "Nam", 52, "Giam DOc");
		NhanVien nv4 = new NhanVien("My", "Nam", 59, "Thu Ky");
		NhanVien nv5 = new NhanVien("Han", "Nu", 55, "Thu Ky");
		
		nv.nhap(nv1);
		nv.nhap(nv2);
		nv.nhap(nv3);
		nv.nhap(nv4);
		nv.nhap(nv5);
		
		//nv.xuat();
		//nv.timKiem();
		//nv.sapXep();
		//nv.sua();
		//nv.xoa();
		nv.nho();
		
	}
	
}
public class AppMain {

	
	public static void main(String[] args) {
		ThreadNV tNV = new ThreadNV();
		
		tNV.run();

	}

}
