package com.lpu.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(20);
		numbers.add(new Integer(15));
		numbers.add(90);
		System.out.println("Number of element in the list"+numbers.size());
		System.out.println("list"+numbers.toString());
		//for list specific-positional access;
		for(int i=0; i<numbers.size();i++) {
			System.out.println(i +"->"+numbers.get(i));
		}
		//for all collection classes 
		System.out.println("using iterator");
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//enhanced for loop
		System.out.println("Enhanced for loop");
		for(int num :numbers) {
			
			System.out.println(num);
			
			
		}
		
		Scanner sc = new Scanner(System.in)	;
		int num= sc.nextInt();
		if(numbers.indexOf(num)!= -1) {
			System.out.println("Found at"+numbers.indexOf(num));
		}
		else {
			System.out.println("Not found");
		}

	}

}
