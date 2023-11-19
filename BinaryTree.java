package dsa;
import java.util.Stack;

public class BinaryTree {
 
	private static TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public  TreeNode(int data) 
		{
			this.data=data;
		}
	
	}
	public void CreateBinaryTree() 
	{
		TreeNode first= new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
	}
	public void  PreOrder(TreeNode root) 
	{
		if(root==null) 
		{
			return;
		}
		System.out.println(root.data+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	public void IterativePreOrder() 
	{
		if(root==null) 
		{
			return;
		}
		Stack <TreeNode>stack = new Stack<>();
		
		stack.push(root);
		while(!stack.isEmpty()) 
		{
			TreeNode temp = stack.pop();
			System.out.print(temp.data);
			if(temp.right!=null) 
			{
				stack.push(temp.right);
			}
			if(temp.left!=null) 
			{
				stack.push(temp.left);
			}
		}
		
	}
	public void Inorder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
	}
	public void postorder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		Inorder(root.left);
		Inorder(root.right);
		System.out.println(root.data);
	}
	public int findmax(TreeNode root) 
	{
		if(root ==null)
		{
			return Integer.MIN_VALUE;
		}
		int result =root.data;
		int left =findmax(root.left);
		int right =findmax(root.right);
		if(left>result) 
		{
			result=left;
		}
		if(right>result) 
		{
			result=right;
		}
		return result;	
	}
	public void iterativeinorder(TreeNode root) 
	{
		Stack<TreeNode>stack = new Stack<>();
		TreeNode  temp =root;
		while(!stack.isEmpty() ||temp!=null) {
		
			if(temp!=null) 
			{
			//	stack = push(temp);
				temp =temp.left;
				
			}
			else 
			{
				temp =stack.pop();
				System.out.println(temp.data);
	      		temp=temp.right;
			}
		}
		
	}
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.CreateBinaryTree();
		//bt.PreOrder(bt.root);
		//bt.IterativePreOrder();
		//bt.Inorder(root);
		bt.postorder(root);
		System.out.print(bt.findmax(root));
	}
}
