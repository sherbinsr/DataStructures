package dsa;

import java.util.NoSuchElementException;

import javax.swing.LayoutStyle;

public class CircularLinkedList {
 
	private ListNode last;
	private int length;
	
	private class ListNode{
		
		private ListNode next;
		private int data;
		
		public ListNode(int data) 
		{
			this.data=data;
		}
}
	public CircularLinkedList() {

		last=null;
		length=0;
}
	  public int length()
	  {
		return length;
		  
	  }
	  public boolean isEmpty() {
      
		  return length==0;
	  }
	  
	  public void createdoublyLinkedlist() 
	  {
		  ListNode first = new ListNode(1);
		  ListNode second = new ListNode(2);
		  ListNode third = new ListNode(3);
		  ListNode fourth = new ListNode(4);
		  ListNode fifth = new ListNode(5);
		  
		  first.next=second;
		  second.next=third;
		  third.next=fourth;
		  fourth.next=fifth;
		  fifth.next=first;
		  
		  last=fifth;
	  }
	  public void display()
	  {
		 if(last==null) {
			 
			 return;
		 }
		 ListNode first = last.next;
		 while(first!=last) 
		 {
			 
			 System.out.print(first.data+"-->");
			first = first.next;
		 }
		 System.out.println(first.data);
		
	  }
	  
	  public void insertfirst(int node) 
	  {
		  
		  ListNode newnode = new ListNode(node);
		  if(last==null)
		  {
			  last=newnode;
		  }
		  else {
			  newnode.next=last.next;
		  }
		  last.next=newnode;
		  
	  }
	  public void insertlast(int data)
	  {
		  ListNode newnode = new ListNode(data);
		  if(last==null) 
		  {
			  last=newnode;
			  last.next=last;
		  }
		  else {
			  
			  newnode.next = last.next;
			  last.next=newnode;
			  last=newnode;
		  }
		  
	  }
	  public void deletefirst() {
		
		  ListNode temp = last.next;
		  if(last.next==null) 
		  {
			  last=null;
		  }
		  else 
		  {
			  
			  
			last.next =  temp.next;
			 
		  } temp.next=null;
		  
	  }
	  public static void main(String[] args) {
		
		  
		  CircularLinkedList cs = new  CircularLinkedList();
		  cs.createdoublyLinkedlist();
		  cs.insertfirst(0);
		  cs.insertlast(6);
		 cs.deletefirst();
		  cs.display();
		  
		  
	}
	  
	
}
