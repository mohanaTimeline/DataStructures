package linkedlist;

import java.util.HashSet;

import linkedlist.delete_alternate.Listnode;

public class duplicate {
public static class Listnode{
		
		private int data;
		private Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}

	} public static Listnode duplicate(Listnode head)
{ HashSet<Integer> hs = new HashSet<>();

/* Pick elements one by one */
Listnode current = head;
Listnode prev = null;
while (current != null) 
{
    int curval = current.data;
     
     // If current value is seen before
    if (hs.contains(curval)) {
        prev.next = current.next;
    } else {
        hs.add(curval);
        prev = current;
    }
    current = current.next;
}
return head;

}
		public static void printList(Listnode head)

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
		third.next=fourth;Listnode newhead=duplicate(head);printList(newhead);
		
	}

}
