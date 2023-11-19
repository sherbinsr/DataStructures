package dsa;

public class LinearSearch {

	  public static void main(String[] args) {
		
		  int arr[]= {15,8,11,66,10,4};
		  
		  LinearSearch ls = new LinearSearch();
		  ls.search(arr, arr.length, 66);
	}
	public int search(int arr[],int n, int x) {
		for(int i =0; i<n; i++) {
			if(arr[i]==x) {
				
				System.out.println("the element founded"+" "+arr[i]);
			}
			
		}return -1;
		
	}
}
