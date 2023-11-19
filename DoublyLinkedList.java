package dsa;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private static class ListNode{
		
	private	int data;
	private	ListNode next;
	private	ListNode previous;
		
		public ListNode(int data) {
			
			this.data =data;
		
		}
		
	}
	
	public void DoublyLinkedList() {
		
		this.head =null;
		this.tail = null;
		this.length=0;
		
		
	}
	public boolean isEmpty() {
		
		return length==0;
	}
	public int length() {
		
		return length;
	}
	public void  forward() {

		if(head==null) {
			return;
		}
		ListNode temp = head;
		while(temp!=null) 
		{
			
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}System.out.println("Null");
	}
	public void backword() {

		
		
		if(tail==null) {
			return;
		}
		ListNode temp = tail;
		
		while(temp != null) 
		{
			
			System.out.print(temp.data+"-->");
			temp = temp.previous;
		}
		System.out.println("Null");
		
	}
	public void insertlast(int value) {
		ListNode newnode = new ListNode(value);
		if(isEmpty()) {
			head = newnode;
		}
		else {
			
			tail.next=newnode;
		}
		newnode.previous=tail;
		tail=newnode;
		length++;
	}
	public void insertfirst(int value) {
		
		ListNode newnode = new ListNode(value);
		if(isEmpty()) 
		{
			
			tail=newnode;
		}
		else {
			
			head.previous=newnode;
			
		}
		newnode.next=head;
		head=newnode;
		
		
		
	}
	public ListNode deletefirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
			
		}
		ListNode temp =head;
	    if(head==tail) {
	    	
	    	tail=null;
	    }else {
	    	
	    	head.next.previous=null;
	    }
	    head=head.next;
	   return temp;
	   }
	public ListNode deletelast() {
		if(isEmpty()) 
		{
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if(head==tail) {
			
			head=null;
		}
		else
		{
			tail.previous.next=null;
			
		}
		tail=tail.previous;
		
		return temp;}
	
	
	public static void main(String[] args) {
		
		 DoublyLinkedList dl = new  DoublyLinkedList();
		   
		   dl.insertlast(1);
		   dl.insertlast(2);
		   dl.insertlast(3);
		   dl.insertlast(4);
           dl.insertfirst(0);
		//   dl.forward();
		  // dl.backword();
		   //dl.length();		
		   //dl.deletefirst();
		 //  dl.deletelast();
		   dl.forward();
		   dl.backword();
		
	}

}