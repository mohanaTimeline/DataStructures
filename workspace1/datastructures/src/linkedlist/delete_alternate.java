package linkedlist;



public class delete_alternate {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}public static Listnode delete_alternate(Listnode head){
		Listnode prev=head;
		Listnode now=head.next;
		while(prev!=null && now!=null)
		{
			 prev.next = now.next;
			 now = null; prev = prev.next; if (prev != null) 
	              now = prev.next;
		}return head;
	} public static void printList(Listnode head)
    {
        Listnode temp = head;
        while(temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
 
	public static void main(String[] args) {
		Listnode head=new Listnode(10);
		Listnode first=new Listnode(11);
		Listnode second=new Listnode(12);
		Listnode third=new Listnode(13);
		Listnode fourth=new Listnode(10);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;delete_alternate(head);
		printList(head);
	}

}
