package interview;
//Implement a tree class which does the following:
//- on construction, call with a number, which is the max number of children of any given node
//- has interface add which takes in an element and adds it to the tree
public class interview2 {

	private static class Node{
		private int data;Node root;
		private Node left;
		private Node right;
		public Node(int data)
		{
			this.data=data;
			this.left=null;
		    this.right=null;
		}
		public static void main(String args[])
		{
		Node root=new Node(1);
		Node root1=new Node(2);
		Node root2=new Node(2);
		
		root.left=root1;
		root.right=root2;
		System.out.println(root);
		}
	}
	
}
