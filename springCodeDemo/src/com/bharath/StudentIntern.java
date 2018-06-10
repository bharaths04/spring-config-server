package com.bharath;

public class StudentIntern {
	private String sname;
	private int id;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Bean2 id() method called");
	}
	

}
