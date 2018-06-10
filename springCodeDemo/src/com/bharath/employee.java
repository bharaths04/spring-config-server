package com.bharath;

import org.springframework.beans.factory.annotation.Autowired;

public class employee {
	public StudentIntern stud;
	String ename;
	int eid;
	int esalary;
	public String getEname() {
		return ename;
	}
	public employee() {
		System.out.println("hello");
	}

	@Autowired
	public employee(StudentIntern stud)
	{
		
		System.out.println("hello from autowired");
		this.stud=stud;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
	}
	public StudentIntern getStud() {
		return stud;
	}
	public void setStud(StudentIntern stud) {
		this.stud = stud;
	}
	public void show()
	{
		System.out.println("employee");
		stud.setId(782);
	}
    
}
