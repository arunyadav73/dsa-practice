// Inserting a new node at starting of the Doubly Linked List
class InsertAtLast
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

    // to a new node at end of the Doubly LinkedList
    void insertAtLast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node current=head;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
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
        InsertAtLast List= new InsertAtLast();
        
        List.insertAtLast(1);
        List.print();
        List.insertAtLast(2);
        List.print();
        List.insertAtLast(3);
        List.print();
        List.insertAtLast(4);
        List.print();
        List.insertAtLast(5);
        List.print();
        List.insertAtLast(6);
        List.print();
    }

}