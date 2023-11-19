package dsa;

public class Arrays {

	
	public static void main(String[] args) {
		
		
	Arrays ar = new Arrays();
	
	

	int[] arr =new int[6];
	arr[0]=1;
	arr[1]=3;
	arr[2]=6;
	arr[3]=8;
	arr[4]=2;
	arr[5]=4;
	arr[6]=7;
	
	int end=arr.length-1;
	int start=0;

	//ar.findMinimumvalue(arr);
	//ar.Array(arr);
//	ar.reverse(arr, start, end);
	//ar.Array(arr);
	//ar.OddOrEven(arr);
	//int result = ar.scecondlargest(arr);
	//System.out.println(result);
	//ar.movezerotoend(arr);
	//ar.Array(arr);
	System.out.println(findmissingnumber(arr));
	}
	public void movezerotoend(int arr[]) 
	{
		int n=arr.length;
		int j=0;
		for(int i=0; i<n; i++) {
			
			if(arr[i]!=0 && arr[j]==0) 
			{
				
				int temp=arr[i];
			    arr[i]=arr[j];
				arr[j]=temp;
				
			}
			if(arr[i]!=0) {
				j++;
			}
		}
	}
	
	
	public int scecondlargest(int arr[]) 
	{
		int highest=0;
		int secondhighest=0;
		
		for(int i:arr) 
		{
			
			if(i>highest) 
			{
				
				secondhighest=highest;
				highest =i;
						
			}
			else if(i>secondhighest) {
				
				secondhighest=i;
			}
		}return secondhighest;
		
		
	}
	public void  findMinimumvalue(int arr[])
	{
		if(arr ==null || arr.length==0) 
		{
			throw new IllegalArgumentException("invalid input");
			
		}
		int min =arr[0];
		for(int i=1; i<arr.length; i++) 
		{
			
			if(arr[i]<min) 
			{
				min=arr[i];
			}
		}
			
		System.out.println(min);
		
	}
	public void OddOrEven(int arr[]) 
	{
		
		for(int  i=0; i<arr.length; i++) 
		{
			
			if(arr[i]%2==0)
			{
				System.out.print("\neven="+arr[i]);
			}
			else
			{
				System.out.print("\nodd="+arr[i]);
			}
			
		}
	}
	public void reverse(int arr[],int start,int  end) {
		
		while(start<end) 
		{
			int  temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	 
	public void Array(int arr[]) 
	{
	
		
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			
			
				
				System.out.print(arr[i]+",");
			}
		
		
		
		
	}
	public void resize(int arr[],int capacity) 
	{
		
		int [] temp = new int[capacity];
		for(int i=0; i<arr.length;i++) 
		{
			
			temp[i]=arr[i];
		}
		arr=temp;
	}
	public static int findmissingnumber(int[]arr) 
	{
		int n = arr.length+1;
		int sum =n*(n+1) /2;
		for(int num:arr) 
		{
			sum = sum-num;
			
		}return sum;
	}
}
