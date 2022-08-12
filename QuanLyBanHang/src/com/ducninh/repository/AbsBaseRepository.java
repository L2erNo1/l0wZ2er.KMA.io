package com.ducninh.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsBaseRepository<E> {
	protected List<E> lstData;

	public AbsBaseRepository() {
		this.lstData = new ArrayList<E>();
	}

	public AbsBaseRepository(List<E> lstData) {
		this.lstData = lstData;
	}

	public List<E> getLstData() {
		return lstData;
	}

	public void setLstData(List<E> lstData) {
		this.lstData = lstData;
	}

}
