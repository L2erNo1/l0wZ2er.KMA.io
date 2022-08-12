package com.ducninh.ui;

import java.util.Date;

import com.ducninh.entities.Dat;
import com.ducninh.entities.Nha;
import com.ducninh.management.Management;
import com.ducninh.repository.GenericRepository;
import com.ducninh.repository.ipl.DatRepository;
import com.ducninh.repository.ipl.NhaRepository;

class AppMainDat implements Runnable {
	@Override
	public void run() {
		GenericRepository<Dat> iDat = new DatRepository();
		Management<Dat> mDat = new Management<Dat>(iDat);

		Dat d1 = new Dat("Quy Nhon", new Date(), 5.6, 100, "B");
		Dat d2 = new Dat("Quy Nhon", new Date(), 8.0, 100, "A");

		mDat.nhap(d1);
		mDat.nhap(d2);

	}
	
}

class AppMainNha implements Runnable {

	@Override
	public void run() {
		GenericRepository<Nha> iNha = new NhaRepository();
		Management<Nha> mNha = new Management<Nha>(iNha);
		Nha n1 = new Nha("Quy Nhon", new Date(), 10.0, 100.0, "Biet thu");
		Nha n2 = new Nha("Quy Nhon", new Date(), 9.0, 100.0, "Chung cu");
		mNha.nhap(n1);
		mNha.nhap(n2);

	}

}

public class AppMain {
	public static void main(String[] args) {
		
		AppMainDat tDat = new AppMainDat();
		AppMainNha tNha = new AppMainNha();

		tDat.run();
		tNha.run();

	}
}
