package dsa;

import java.util.NoSuchElementException;

public class Queue {

	
	private ListNode front;
	private  ListNode rear;
	private int length;
	private class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	public int length() 
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public void Enqueue(int data) 
	{
		ListNode temp = new ListNode(data);
		if(isEmpty()) 
		{
			front=temp;
		}
		else 
		{
			rear.next=temp;
		}rear=temp;
		length++;
	}
	public void Dequeue() 
	{
		if(isEmpty()) 
		{
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		length--;
		System.out.println("Dequed Element:"+result);
		
	}
	public void display() 
	{
		ListNode current=front;
		while(current!=null) 
		{
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("NuLL");
	}
	public static void main(String[] args) {
		
		Queue q= new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.display();
		q.Dequeue();
		q.display();
		
	}
}
