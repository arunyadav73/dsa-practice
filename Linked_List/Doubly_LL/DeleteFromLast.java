class DeleteFromLast
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

    // to delete Last node
    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty can not delete");
        }
        else if(head.next==null)
        {
            head=null;
            System.out.println("Linked list is Now Empty");
        }
        else
        {
            Node current = head;
            while(current.next.next != null)
            {
                current=current.next;
            }
            current.next.previous=null;
            current.next=null;
        }
    }

    // to insert into linked list
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
        DeleteFromLast List=new DeleteFromLast();

        List.insertAtLast(1);
        List.insertAtLast(2);
        List.insertAtLast(3);
        List.insertAtLast(4);
        List.insertAtLast(5);
        List.insertAtLast(6);
        List.print();

        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();

        List.insertAtLast(7);
        List.insertAtLast(8);
        List.insertAtLast(9);
        List.print();

        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();
        List.print();
        List.deleteLast();

    }
}