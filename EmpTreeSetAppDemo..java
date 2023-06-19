package com.lpu.app;
import com.lpu.beans.*;
import java.util.*;

public class EmpTreeSetAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classCastExceptio
		EmpTreeSetDemo p1= new EmpTreeSetDemo(9,"Ali","Ali@gmail.com");
		EmpTreeSetDemo p2= new EmpTreeSetDemo(1,"pp","Ali@gmail.com");
		EmpTreeSetDemo p3= p2;
		
		TreeSet<EmpTreeSetDemo>persons=new  TreeSet<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(new EmpTreeSetDemo(2,"abdul","abdul@kk")) ;
		System.out.println("Number of person"+ persons.size());
		System.out.println(persons);		

	}

}
