package dsa;
import java.util.EmptyStackException;

public class Stack {
	
	private ListNode top;
	private int length;
	
	private class ListNode 
	{
		
		private int data;
		private ListNode next;
		
		public ListNode (int data) 
		{
			this.data=data;
		}
	}
	public Stack() 
	{
		
		top=null;
		length=0;
	}
	public boolean isEmpty() 
	{
		return length==0;
	}
	public void push(int data) 
	{
		ListNode temp = new ListNode(data);
		temp.next =top;
		top=temp;
		length++;
		
	}
	public void pop() 
	{
		
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		int result=top.data;
		top=top.next;
		length--;
		System.out.println(result);
	}
	public void peek() 
	{

		if(isEmpty())
		{
			throw new EmptyStackException();
		}System.out.println(top.data);
		
	}
	
	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.peek();
		s.pop();
		s.peek();
		
	}

}
