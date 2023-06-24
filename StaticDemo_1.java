package com.lpu.beans;

public class StaticDemo_1 {
	int id;
	String name;
	static int playerId=0;
	
	 StaticDemo_1(String name){
		name=name;
		id= ++playerId;
	}
	 void details() {
		System.out.println(name+" "+id);
	}

}
