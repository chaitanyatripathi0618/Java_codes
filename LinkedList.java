package com.lpu.beans;

public class LinkedList {
	
	
	public static void Display(Node head){
		Node temp=head;
		while(temp!=head) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
		
		
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a= new Node(3);
		Node b= new Node(4);
		Node c= new Node(1);
		Node d= new Node(4);
		Node e= new Node(0);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		Display(a);
		

	}

}
