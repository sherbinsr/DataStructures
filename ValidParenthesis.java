package dsa;
import java.util.Stack;
public class ValidParenthesis {

	
	
	boolean isvalid(String str) {
		
		Stack<Character>stack = new Stack();
		for(char c:str.toCharArray()) 
		{
			if(c=='('||c=='{'||c=='[') 
			{
				stack.push(c);
			}else 
			{
				if(stack.isEmpty()) {
					return false;
				}
				else 
				{
					char top=stack.peek();
					if(c==')'&&top=='('||c=='}'&&top=='{'||c==']'&&top=='[') {
						
						stack.pop();
						
					}
					else 
					{
						return false;
					}
				}
			}
		}return stack.isEmpty();
	}
	public static void main(String[] args) {
		
     ValidParenthesis vp =new ValidParenthesis();
     vp.isvalid("()");
		
	}

}
