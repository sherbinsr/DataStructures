package dsa;
public class BinarySearchTree {
   
	private static TreeNode root;
	
	private static class TreeNode
	{
		private int data;
		private TreeNode right;
		private TreeNode left;
		
		public TreeNode(int data) 
		{
			this.data=data;
		}
		
	} 
	public void insert(int value) 
	{
		root=insert(root,value);
	}
	public TreeNode insert(TreeNode root,int value) 
	{
		if(root==null) 
		{
			root= new TreeNode(value);
			return root;
		}
		if(value<root.data) 
		{
			root.left=insert(root.left,value);
		}
		else 
		{
			root.right=insert(root.right,value);
		}
		return root;
		
	}
	public TreeNode search(TreeNode root, int key) 
	{
		if(root==null||root.data==key) 
		{
			return root;
		}
		if(key<root.data) 
		{
			return search(root.left,key);
		}
		else 
		{
			return search(root.right,key);
		}
	
		
	}
	public void inorder(TreeNode root) 
	{
		if(root==null) 
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void main(String[] args) {
	BinarySearchTree bst =  new BinarySearchTree();
	bst.insert(8);
	bst.insert(5);
	bst.inorder(root);
	System.out.println();
		
	}
	
}
