package JAVALinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private CircularLinkedList(Node head,Node tail)
    {
        this.head=null;
        this.tail=null;
    }

/*---------------------------insertion---------------------------------- */
//insert
public void insert(int data)
{
    Node node = new Node(data);
    if(head==null)
    {
        head=node;
        tail=node;
    }

    tail.next=node;
    node.next=head;
    tail=node;
}
/*--------------------------Deletion---------------------------------- */
public void delete(int data)
{
     Node node=head;
     if(node==null)
     {
        return;
     }
     if(node.data==data)//delete first
     {
        head=head.next;
        tail.next=head;
     }

     do{
        Node n = node.next;
        if(n.data==data)
        {
            node.next=n.next;
            break;
        }
        node=node.next;
     }while(node!=head);
    
}

/*-------------------------Display------------------------------------ */
public void Display()
{
    Node node=head;
    if(head!=null)
    {
        do{
            System.out.print(node.data+" --> ");
            node=node.next;
        }
        while(node!=head);
    }
    System.out.println("Head");
}
/*-----------------------------Node Creation-------------------------------- */
    private class Node{
        int data;
        Node next;

        private Node(int data){
            this.data=data;
        }
        private Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
/*---------------------------Driver Code---------------------------------- */

    public static void main(String args[])
    {
        CircularLinkedList cll = new CircularLinkedList(null, null);
        cll.insert(3);
        cll.insert(5);
        cll.insert(9);
        cll.insert(49);
        cll.delete(9);
        cll.Display();
    }
}
