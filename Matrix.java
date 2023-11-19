package dsa;

public class Matrix {
	
	public static void main(String[] args) {
int[][] matrix = {
				
				{10,20,30,40},
				{12,25,35,45},
				{27,29,37,48},
				{32,33,39,51}
		};

		Matrix mx = new Matrix();
		mx.search(matrix, matrix.length, 42);
		
	}

  public void search(int[][]matrix, int n,int x) 
  {
	  int i=0;
	  int j=n-1;
	  while(i<n && j>=0) {
		  
		  if(matrix[i][j]==x) {
			  System.out.println("element found");
		  }
		  if(matrix[i][j]>x) {
			  j--;
		  }
		  else {
			  i++;
		  }
	  }
	  System.out.println("element not found");
  }
}
