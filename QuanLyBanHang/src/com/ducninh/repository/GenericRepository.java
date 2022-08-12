package com.ducninh.repository;

public interface GenericRepository<E> {
	void nhap(E e);
	
	void tinhTien(E e);
}
