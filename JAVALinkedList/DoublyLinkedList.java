//Doubly LinkedList with insertion display 
package JAVALinkedList;
public class DoublyLinkedList {
private Node head;
private int size = 0;
private DoublyLinkedList()
{
    this.size =0;
}
/*---------------Insertion------------------------------------------------- */
//insertFirst
public void insertFirst(int data)
{
    Node node= new Node(data);
    node.next=head;
    node.prev=null;
    if(head!=null)
    {
        head.prev=node;
    }
   
    head=node;
    size++;
}

//Insert Last
public void insertLast(int data)
{
    Node node = new Node(data); 
    Node last = head;
    node.next=null;
    if(head==null)
    {
        node.prev=null;
        head=node;
        return;
    }
    while(last.next!=null)
    {
        last = last.next; //it gives an error if the head is null
    }
    last.next=node;
    node.prev=last;
    size++;
}
//Insert any index
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
    for(int i=1;i<index;i++)//so we start the iteratiion with 1
    { 
        temp=temp.next;
    }
    Node node = new Node(data,temp.next,temp);//there is change in insert any
    temp.next.prev=node;//there is change in insert any
    temp.next=node; 
    size+=1;
}


//insert after any node
    public void insertAfterData(int after,int data)
    {
        Node p = find(after);
        if(p==null)
        {
            System.out.println("value doesnot exist");
            return;
        }
        Node node = new Node(data);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)
        {
            node.next.prev=node;
        }
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
    
/*---------------Display------------------------------------------------- */
public void Display(){
    Node node=head;
    Node last = null;
  //  System.out.print("NULL --> ");

    while(node!=null)
    {
        System.out.print(node.data+" --> ");
        last = node;
        node=node.next;        
    }
    System.out.println("End");
    System.out.println("The reverse order of an linked list");//Reverse Display
    //System.out.print("NULL --> ");\
    
    while(last!=null)
    {     
        
        System.out.print(last.data+" --> ");
        last=last.prev;
        
    }
        System.out.println("Start");
        System.out.println("the size of a linked list is: "+size);
}
/*---------------Node Creation------------------------------------------------- */
    private class Node{
        int data;
        Node next;
        Node prev;

    public Node(int data)
    {
        this.data= data;
    }

     public Node(int data,Node next,Node prev)
    {
        this.data= data;
        this.next=next;
        this.prev= prev;
    }
}
/*---------------------------------------------------------------- */
    public static void main(String args[])
    { 
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(6);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertLast(9);
        dll.insertAny(49, 2);
        dll.insertAfterData(9, 48);
        dll.Display();
        
    }
}
