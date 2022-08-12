package com.ducninh.repository.ipl;

import com.ducninh.entities.Dat;
import com.ducninh.repository.AbsBaseRepository;
import com.ducninh.repository.GenericRepository;

public class DatRepository extends AbsBaseRepository<Dat> implements GenericRepository<Dat> {

	@Override
	public void nhap(Dat d) {

		this.lstData.add(d);
		System.out.println("Nhap thanh cong!!!");
		System.out.println("Thong tin dat:");

		System.out.println(d);

		tinhTien(d);
	}

	@Override
	public void tinhTien(Dat d) {
		System.out.println("Thanh tien");

		double tt = 0;

		if (d.getLoaiDat() == "A") {
			tt = d.getDienTich() * d.getDonGia() * 1.5;
		} else if (d.getLoaiDat() == "B" || d.getLoaiDat() == "C") {
			tt = d.getDienTich() * d.getDonGia();
		}
		System.out.println(tt);

	}

}
