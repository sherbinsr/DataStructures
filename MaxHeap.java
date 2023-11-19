package dsa;

public class MaxHeap {
  
	private Integer[] heap;
     private int  n;    
     public void MaxHeap (int capacity) {
    	 
    	 heap =new Integer[capacity+1];
    	 int n=0;
     }
     public boolean isempty() {
		return n==0;
    	 
     }
	 public int size() {
		 
		 return n;
	 }
	 public void insert(int x) {
		 
		 if(n==heap.length-1) {
			 System.out.println("heap is full");
		 }
		 n++;
		 heap[n]=x;
		 swim(n);
		 
	 }
	 private void swim(int k) {
		 
		 while(k>1 && heap[k/2]<heap[k]) {
			 int temp =heap[k];
			 heap[k]= heap[k/2];
			 heap[k/2]=temp;
			 k=k/2;
		 }
	 }
	 public static void main(String[] args) {
		
		 MaxHeap mh = new MaxHeap();
		 mh.isempty();
	}
}
