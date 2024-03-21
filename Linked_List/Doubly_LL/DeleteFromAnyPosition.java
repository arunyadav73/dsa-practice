class DeleteFromAnyPosition
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

    // to delete node of given position, position starts from 1
    void deleteFromPosition(int pos)
    {
        // for empty linked list
        if(head==null)
        {
            System.out.println("Linked list is Empty can not delete");
        }

        // 0 is not an position, position start from 1
        else if(pos==0)
        {
            System.out.println("\nPosition 0 do not exist, position start from 1");
            System.out.println("Can not delete node at the position "+pos+"\n");
        }

        // if linked list have single node
        else if(pos==1 && head.next==null)
        {
            head=null;
        }

        // delete first node when linjed list have for then 1 node
        else if(pos==1)
        {
            head=head.next;
            head.previous=null;
        }

        // delete between nodes
        else if(pos<size())
        {
            Node current=head;
            for(int i=2;i<pos;i++)
            {
                current=current.next;
            }
            current.next=current.next.next;
            current.next.previous=current;
        }

        // when position = size,deleting last node
        else if(pos==size())
        {
            Node current=head;
            while(current.next.next != null)
            {
                current=current.next;
            }
            current.next.previous=null;
            current.next=null;
        }

        // invalid position
        else
        {
            System.out.println("\nYou Entered wrong position which is greater then size of the Linked List");
            System.out.println("Current size of the Linked List : "+size());
            System.out.println("Can not delete node at the position "+pos+"\n");
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

    int size()
    {   int size = 0;          // initial size  of Linked List is 0
        if(head==null)
        {
            return 0;
        }
        else
        {
            Node current=head;
            while(current !=null)
            {
                size=size+1;
                current=current.next;
            }
            return size;
        }
    }

    public static void main(String[] ar)
    {
        DeleteFromAnyPosition List=new DeleteFromAnyPosition();

        List.insertAtLast(1);
        List.insertAtLast(2);
        List.insertAtLast(3);
        List.insertAtLast(4);
        List.insertAtLast(5);
        List.insertAtLast(6);
        List.insertAtLast(7);
        List.insertAtLast(8);
        List.print();

        List.deleteFromPosition(3);
        List.print();
        List.deleteFromPosition(6);
        List.print();
        List.deleteFromPosition(0);
        List.print();
        List.deleteFromPosition(30);
        List.print();

        List.insertAtLast(17);
        List.insertAtLast(48);
        List.print();

        List.deleteFromPosition(3);
        List.print();
        List.deleteFromPosition(5);
        List.print();
        List.deleteFromPosition(1);
        List.print();
        List.deleteFromPosition(3);
        List.print();
        List.deleteFromPosition(3);
        List.print();

        List.insertAtLast(11);
        List.insertAtLast(10);
        List.print();

        List.deleteFromPosition(1);
        List.print();
        List.deleteFromPosition(6);
        List.print();
        List.deleteFromPosition(3);
        List.print();
        List.deleteFromPosition(1);
        List.print();
        List.deleteFromPosition(2);
        List.print();
        List.deleteFromPosition(1);
        List.print();
        List.deleteFromPosition(1);
        List.print();
    }

}