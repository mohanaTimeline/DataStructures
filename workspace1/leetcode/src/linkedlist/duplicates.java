package linkedlist;


import linkedlist.linkedlist.Listnode;
import linkedlist.loop.Node;

public class duplicates {

    static Node head;
 
    public static class Node {
 
        int val;
        Node next;
 
        Node(int d) {
            val = d;
            next = null;
        }
    }


    public Node deleteDuplicates(Node head) {
      
    	Node current=head;
         while(current != null) {
        	 if (current.next == null) {
        		 break;
        	 }
        	 if (current.val == current.next.val) {
        		 current.next = current.next.next;
        	 } else {
        		 current = current.next;
        	 }
         }
         
         return head;
    } 
    public void display(Node head)
    {
    	if(head==null)
    	{
    		return;
    	}
    	Node current=head;
    	while(current!=null)
    	{
    		System.out.println(current.val+"-->");
    		current=current.next;
    	}System.out.println(current);
    }
	public static void main(String[] args) {
		duplicates list = new duplicates();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
     
       
        Node newhead = list. deleteDuplicates(head);
        list.display(newhead);
	}

}
