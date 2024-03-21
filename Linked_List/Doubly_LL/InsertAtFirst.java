// In this code we Insert a new node at starting of an doubly lnkedlist
class InsertAtFirst
{
    Node head;
    // creating node
    class Node
    {
        int data;
        Node next;          // point next node
        Node previous;      // point previous node

        // constructor for creating new node
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }

    // fuction to add a node at starting of the Doubly Linkedlist
    void insertAtFirst(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
    }

    // function to print Doubly Linked List
    void print()
    {
        if(head==null)
        {
            System.out.println("Doubly Linkedlist is Empty can not print any data");
        }
        else
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.data+" --> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }
    
    public static void main(String[] ar)
    {
        InsertAtFirst List = new InsertAtFirst();

        List.insertAtFirst(1);
        List.print();
        List.insertAtFirst(2);
        List.print();
        List.print();
        List.insertAtFirst(3);
        List.print();
        List.insertAtFirst(4);
        List.print();
        List.insertAtFirst(5);
        List.print();

    }

}