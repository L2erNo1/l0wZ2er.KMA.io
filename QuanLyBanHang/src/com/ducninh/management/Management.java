package com.ducninh.management;

import com.ducninh.repository.GenericRepository;

public class Management<E> {
	GenericRepository<E> lst;
	
	public Management() {
		// TODO Auto-generated constructor stub
	}
	
	public Management(GenericRepository<E> e) {
		this.lst = e;
	}

	public void nhap(E e) {
		this.lst.nhap(e);
	}
	
	public void tinhTien(E e) {
		this.lst.tinhTien(e);
	}
}
