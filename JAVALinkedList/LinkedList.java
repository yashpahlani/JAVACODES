//Complete singly Linked list with insertion,deletion,finding/searching and display properties

package JAVALinkedList;
public class LinkedList {
    private Node head;  //reference pointers pointing to the node
    private Node tail;
    private int size = 0;
    private LinkedList()
    {
        this.size =0;
    }
/*--------------------------------------Insertion----------------------------------------------------- */
    //insertion at first position
    public void insertFirst(int data)
    {
        Node node = new Node(data);
        node.next=head;
        /*node.next = head; sets the next reference of the new node to point to
        the current head (which might be null if the list is empty or
        the first node if the list is not empty). Then, head = node; updates
        the head to point to the new node, making it the new first node in the list. */
        head=node;

        if(tail==null)
        {
            tail=head;
        }

        size+=1;
    }

    //insertion at last position
    public void insertLast(int data)
    {
        Node node = new Node(data);
        tail.next=node;
        tail=node;
        if(tail==null)
        {
            insertFirst(data);
            return;
        }

        size+=1;
    }

    public void insertAny(int data,int index)
    {
        if(index==0)
        {
            insertFirst(data);
            return;
        }
        if(index==size)
        {
            insertLast(data);
            return;
        }

        Node temp = head;//this is zero index itself
        for(int i = 1  ;i<index;i++)//so we start the iteratiion with 1
        { 
            temp=temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next=node;
        size+=1;
    }
/*---------------------------------------------Deletion--------------------------------------------------- */
//Deletion First
public int deleteFirst()
{
   int data = head.data;
    head=head.next;
    if(head==null)
    {
        tail=null;
    }
    size--;
    return data;
}

//delete last
public int deleteLast()
{
    if(size<1)
    {
        return deleteFirst();       
    }
    Node secondLast = getIndex(size-2);
    int data = tail.data;
    //System.out.println(data);
    tail=secondLast;
    tail.next=null;
    size--;
    return data;

}

//delete from anywhere
public int deleteAny(int index)
{
    if(index==0)
    {
        return deleteFirst();
    }
        if(index==size)
    {
        return deleteLast();
    }
    Node prev = getIndex(index-1);
    int data = prev.next.data;
    prev.next = prev.next.next;
    size--;
    return data;
    
}
/*------------------------------------------Searching-------------------------------------------------------- */
//Searching
public Node getIndex(int index)
{
    Node node = head;
    for(int i=0;i<index;i++)
    {
        node=node.next;
    }
    return node;
}

public Node find(int data)
{
    Node node = head;
    while(node!=null)
    {
        if(node.data==data)
        {
            return node;
        }
        node=node.next;
    }
    return null;
}

// public void find(int data) {
//     int index = 0;
//     Node node = head;
//     while (node != null && node.data != data) {
//         index++;
//         node = node.next;
//     }

//     if (node == null) {
//         System.out.println("The element was not found");
//     } else {
//         System.out.println("The element was found at index " + index);
//     }
// }
// /*----------------------------------------Displaying----------------------------------------------------- */
public void Display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data +" --> ");
            temp=temp.next;
        }
        System.out.println("NULL");
        
        System.out.println("the size of a linked list is: "+size);
    }
/*-------------------------------------------------------------------------------------------------------- */
/*-------------------------------------------------------------------------------------------------------- */ 
    //Node Creation
    private class Node{
        int data;
        Node next;

        private Node(int data)
        {
            this.data= data;
        }

        private Node(int data,Node next)
        {
            this.data = data;
            this.next= next;
        }
    }
/*-------------------------------------------------------------------------------------------------------- */
/*-------------------------------------------------------------------------------------------------------- */

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(6);
        ll.insertFirst(8);
        ll.insertLast(49);
        ll.insertAny(1, 2);
        ll.deleteFirst();
        ll.deleteLast();
        ll.deleteAny(2);     
        ll.Display();
        //ll.find(6);

    }
}
