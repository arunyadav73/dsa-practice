class DeleteLast
{
    Node head;      // head of the Linked List
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
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
        }
        else
        {
            Node current=head;
            while(current.next.next !=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }

    // to at node at the last of the linked list
    void insertAtLast(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node current=head;
            while(current.next  != null)
            {
                current =current.next;
            }
            current.next=newnode;
            
        }
    }

    // to print Linked List
    void print()
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty can not print");
        }
        else
        {
            Node current=head;
            while(current !=null)
            {
                System.out.print(current.data+" --> ");
                current=current.next;
            }
            System.out.println("End");
        }
    }

    public static void main(String[] ar)
    {
        DeleteLast List=new DeleteLast();

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