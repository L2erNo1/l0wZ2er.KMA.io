package com.ducninh.repository.ipl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.ducninh.entities.NhanVien;
import com.ducninh.repository.AbsBaseRepository;
import com.ducninh.repository.GenericRepository;

public class NhanVienRepository extends AbsBaseRepository<NhanVien> implements GenericRepository<NhanVien> {

	private Scanner sc;

	@Override
	public void nhap(NhanVien e) {
//		NhanVien e = new NhanVien();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap thong tin nhan vien:");
//		
//		System.out.println("Nhap ho ten:");
//		e.setHoTen(sc.nextLine());
//		
//		System.out.println("Nhap phai:");
//		e.setPhai(sc.nextLine());
//		
//		System.out.println("Nhap chuc vu:");
//		e.setChucVu(sc.nextLine());
//		
//		System.out.println("Nhap tuoi:");
//		e.setTuoi(sc.nextInt());
//		

		this.lstData.add(e);
		System.out.println("Nhap thanh cong!!!");
		
	}

	@Override
	public void xuat() {
		int nam = 60;
		int nu = 55;
		
		System.out.println("Danh sach xuat ra man hinh");
		this.lstData.stream().filter(nv->(nam - nv.getTuoi() <= 1 && nv.getPhai()=="Nam")||(nu - nv.getTuoi() <= 1 && nv.getPhai()=="Nu")).forEach(nv->System.out.println(nv));

	}

	@Override
	public void timKiem() {
		System.out.println("Tim kiem theo chuc vu:");
		System.out.println("Nhap chuc vu muon tim kiem");
		sc = new Scanner(System.in);
		
		String cv = sc.nextLine();
		
		System.out.println("Nhan vien voi chuc vu " + cv + " la: ");
		
		this.lstData.stream().filter(nv -> nv.getChucVu().equals(cv)).forEach(nv -> System.out.println(nv));

	}
	
	@Override
	public void sapXep() {
		
		System.out.println("Danh sach sau khi da sap xep");
		Collections.sort(this.lstData, new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {

				return (int)o1.getTuoi() - o2.getTuoi();
			}
			
			
		});
		this.lstData.stream().forEach(nv->System.out.println(nv));
	}

	@Override
	public void sua() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ten nhan vien muon sua");
		String name = s.nextLine();
		
		System.out.println("Nhap Chuc vu muon sua");
		String cv = s.nextLine();
		this.lstData.stream().filter(nv->nv.getHoTen().equals(name)).forEach(d -> d.setChucVu(cv));
		this.lstData.stream().forEach(d -> System.out.println(d));
	}

	@Override
	public void xoa() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ten nhan vien muon xoa");
		String name = s.nextLine();
		
		NhanVien nv1 = (NhanVien) this.lstData.stream().filter(nv -> nv.getHoTen().equals(name)).findFirst().get();
		this.lstData.remove(nv1);
		this.lstData.stream().forEach(nv -> System.out.println(nv));
		
	}

	@Override
	public void nho() {
		sapXep();
		System.out.println("Nhan vien nho tuoi nhat");
		System.out.println(this.lstData.stream().findFirst().get());
		
	}
	
	
	
}
