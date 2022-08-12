package com.ducninh.repository;

public interface GenericRepository<E> {

	void nhap(E e);
	
	void xuat();
	
	void timKiem();
	
	void sapXep();
	
	void sua();
	
	void xoa();
	
	void nho();
}
