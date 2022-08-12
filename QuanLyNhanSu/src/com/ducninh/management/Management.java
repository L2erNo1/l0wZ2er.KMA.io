package com.ducninh.management;


import com.ducninh.repository.GenericRepository;

public class Management<E> {
	GenericRepository<E> lst;
	
	public Management() {
		
	}

	public Management(GenericRepository<E> lst) {
		super();
		this.lst = lst;
	}
	
	public void nhap(E e) {
		this.lst.nhap(e);
	}
	
	public void xuat() {
		this.lst.xuat();
	}
	
	public void timKiem() {
		
		this.lst.timKiem();
	}
	
	public void sapXep() {
		this.lst.sapXep();
	}
	
	public void sua() {
		this.lst.sua();
	}
	
	public void xoa() {
		this.lst.xoa();
	}
	
	public void nho() {
		this.lst.nho();
	}
	
}
