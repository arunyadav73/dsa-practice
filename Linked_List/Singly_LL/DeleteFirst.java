class DeleteFirst
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
            System.out.println("Linked List is emplty");
        }
        else
        {
            Node current=head;
            while(current !=null)
            {
                System.out.print(current.data+" --> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }

    // to delete starting node
    void deleteFrist()
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty");
        }
        else if(head.next==null)
        {
            head=null;
            System.out.println("Linked list is Now Empty");
        }
        else
        {
            head=head.next;
        }
    }

    public static void main(String[] ar)
    {
        DeleteFirst List=new DeleteFirst();

        List.insertAtLast(1);
        List.insertAtLast(2);
        List.insertAtLast(3);
        List.insertAtLast(4);
        List.insertAtLast(5);
        List.insertAtLast(6);
        List.print();

        List.deleteFrist();
        List.print();
        List.deleteFrist();
        List.print();

        List.insertAtLast(7);
        List.insertAtLast(8);
        List.insertAtLast(9);
        List.print();

        List.deleteFrist();
        List.print();
        List.deleteFrist();
        List.print();
    }
}