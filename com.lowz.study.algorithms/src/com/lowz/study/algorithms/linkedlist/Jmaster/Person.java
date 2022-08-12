package com.lowz.study.algorithms.linkedlist.Jmaster;

public class Person {
	private int id;

	public Person(){
		
	}

	public Person(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		return equals(obj instanceof Person)?(((Person)obj).getId()==this.id):false;
	}
}
