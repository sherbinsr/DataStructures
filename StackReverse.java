package dsa;
import java.util.Stack;
public class StackReverse {

	
	 public  static void reverse(String str) 
	 {
		 Stack<Character> stack = new Stack<>();
		 char[] chars = str.toCharArray();
		 for(char c:chars) 
		 {
			 
			 stack.push(c);
		 }
		 for(int i=0; i<str.length(); i++) 
		 {
			 
			 chars[i]=stack.pop();
		 }
		 System.out.println(chars);
	 
	 }
	public static void main(String[] args) {
		
		reverse("sherbin");
	
	}

}
