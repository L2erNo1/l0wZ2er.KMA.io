package com.lowz.study.algorithms.equals;

public class Person {
	private int id;
	private String name;

	public Person() {
		
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Person) {
			Person p2 = ((Person) obj);
			if(p2.getId()==this.id) {
				return true;
			
			}else
				return false;
		}
		else
			return false;
	}
}
