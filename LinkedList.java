package dsa;

public class LinkedList {

	private ListNode head;
	
  private static class ListNode{
		
    	
	   private int data;
	   private ListNode next;
		
	   private ListNode(int data) {
			
			this.data=data;
			this.next=null;
			
		}
		
	}
  public void insertfirst(int value) {
		
		ListNode newnode = new ListNode(value);
		newnode.next=head;
    	head=newnode;
		
		
		
	}
  public void insertlast(int value) {
	  
	  ListNode  newnode = new ListNode(value);
	  if(head==null) {
		  
		  newnode=head;
	  }else {
		  
		  ListNode current =head;
		  while(current.next != null) {
			  
			  current=current.next;
		  }
		  current.next= newnode;
	  }
	 
	
  }
	
  public void deleteposition(int position) {
	  
	  if(head==null) {
		  
		 head=head.next;
	  }
	  else{
      ListNode previous = head;
	  int count =1;
	  while(count<position-1) {
		  
		  previous =previous.next;
		  count++;
		  
	  }
	  ListNode current =previous.next;
	  previous.next=current.next;
	  }
  }
		

	public void length() {
	
	 ListNode current = head;
	 
	 int count=0;
	 while(current!=null) {
		 
		current=current.next;
		count++;
	 }
	 System.out.println(count);
		
	}
	
	public ListNode middlenode() {
		
		ListNode fstptr=head;
		ListNode slwptr=head;
		while(fstptr!=null && fstptr.next!=null) {
			
			slwptr=slwptr.next;
			fstptr=fstptr.next.next;
		}
		return slwptr;
		
		
	}
	public void dupicateelement() {
		
		ListNode current =head;
		while(current!=null &&current.next!=null) {
			
			if(current.data == current.next.data ) {
				current.next=current.next.next;
			}
			else {
				
				current =current.next;
			}
		}
		
	}
	public void insertpost(int posititon ,int value)
	{
		ListNode newnode = new ListNode(value);
		if(posititon ==1) {
			newnode.next=head;
			head=newnode;
			
		}
		else {
		ListNode previous =head;
		int count =1;
		while(count < posititon -1)
		{
			
		 previous =previous.next;
		 count++;
		}
		
		ListNode current =previous.next;
		newnode.next=current;
		previous.next=newnode;
	}}
	public  void checknode(int searchnode) {
		
		ListNode current =head;
		
		while(current!=null) 
		{
			
			if(current.data==searchnode) {
				
				System.out.println(current.data);
			}	current=current.next;
		}
		
	}
	
	public void display()
	{

	ListNode current = head;
	
	while(current!=null) {
		
		System.out.print(current.data+"-->");
		current =current.next;
	}
	System.out.println("Null");
		
	}
   public ListNode reverse(ListNode head)
   {
	   ListNode current =head;
	   ListNode previous =null;
	   ListNode next=null;
	   while(current!=null) {
		   
		   next=current.next;
		   current.next=previous;
		   previous=current;
		   current=next;
		   
	   }return previous;
	
	   
	  	   
   }
	
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		LinkedList lss = new LinkedList();
		lss.head = new ListNode(1);
		ListNode sode = new ListNode(2);
		ListNode tode = new ListNode(3);
		ListNode fode = new ListNode(4);
		
		lss.head.next=sode;
		sode.next=tode;
		tode.next=fode;
		
		ls.head= new ListNode(1);
		ListNode secondnode = new ListNode(2);
		ListNode thirdnode = new ListNode(3);
		ListNode fourthnode = new ListNode(4);
		
		ls.head.next=secondnode;
		secondnode.next=thirdnode;
		thirdnode.next=fourthnode;
				
		
		
	//	ls.insertfirst(1);
	  // ls.dupicateelement();	
	    //ls.insertlast(70);
	   //ls.insertpost(1, 50);
	  // ls.insertpost(4, 80);
	  //System.out.println(ls.middlenode().data);
		ls.checknode(5);
		ls.reverse(fourthnode);
		//ls.deleteposition(3);
		ls.display();
		ls.length();
		
		//lss.display();
		//lss.length();
		
	}
	
	
}
