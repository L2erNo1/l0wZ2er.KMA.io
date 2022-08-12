package com.ducninh.repository.ipl;

import com.ducninh.entities.Nha;
import com.ducninh.repository.AbsBaseRepository;
import com.ducninh.repository.GenericRepository;

public class NhaRepository extends AbsBaseRepository<Nha> implements GenericRepository<Nha> {

	@Override
	public void nhap(Nha e) {
		this.lstData.add(e);
		System.out.println("Nhap thanh cong!!!");
		System.out.println("Thong tin nha:");

		System.out.println(e);
		tinhTien(e);
	}

	@Override
	public void tinhTien(Nha e) {
		System.out.println("Thanh tien");

		double tt = 0;

		if (e.getLoaiNha() == "Biet thu") {
			tt = e.getDienTich() * e.getDonGia();
		} else if (e.getLoaiNha() == "Chung cu") {
			tt = e.getDienTich() * e.getDonGia() * 90 / 100;
		}
		System.out.println(tt);

	}

}
