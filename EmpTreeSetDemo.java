package com.lpu.beans;

public class EmpTreeSetDemo implements Comparable<EmpTreeSetDemo> {
	int id;
	String name;
	String email;
	public EmpTreeSetDemo() {
		super();
	}
	
	
	public EmpTreeSetDemo(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmpTreeSetDemo [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	@Override
	public int compareTo(EmpTreeSetDemo o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	

}
