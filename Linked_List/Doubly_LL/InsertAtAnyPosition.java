class InsertAtAnyPosition
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

    // to at a node between two nodes of the linked list
    // here we pass position number of the new node to be added as pos
    void insertAtPosition(int data,int pos)
    {
        //creating new node
        Node newnode = new Node(data);

        // if Linked is empty and position is 1
        if(head==null && pos==1)
        {
            head=newnode;
        }
        // 0 is not an position, position start from 1
        else if(pos==0)
        {
            System.out.println("\nYou Entered wrong position 0, position start from 1");
            System.out.println(data + " can not added at the position "+pos+"\n");
        }
        // insert at position 1
        else if(pos==1)
        {
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
        // insert at bitween nodes
        else if(pos<=size())
        {
            Node current=head;
            for(int i=2;i<pos;i++)
            {
                current=current.next;
            }
            newnode.next=current.next;
            current.next.previous=newnode;
            current.next=newnode;
            newnode.previous=current;
            
        }
        // insert at last
        else if(pos==size()+1)
        {
            Node current=head;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        // if position is invalid and greater then size
        else
        {
           System.out.println("\nYou Entered wrong position which is greater then size of the Linked List");
           System.out.println("Current size of the Linked List : "+size());
           System.out.println(data + " can not added at the position "+pos+"\n");
        }
    }

    // to find size of Linked list
    int size()
    {
        int size=0;
        if(head==null)
        {
            return 0;
        }
        else
        {
            Node current=head;
            while(current != null)
            {
                size=size+1;
                current=current.next;
            }
            return size;
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

    public static void main(String[] args )
    {
        InsertAtAnyPosition List = new InsertAtAnyPosition();

        List.insertAtPosition(1,1);
        List.print();
        List.insertAtPosition(2,2);
        List.print();
        List.insertAtPosition(3,3);
        List.print();
        List.insertAtPosition(4,4);
        List.print();
        List.insertAtPosition(5,5);
        List.print();
        List.insertAtPosition(77,4);
        List.print();
        List.insertAtPosition(55,6);
        List.print();
        List.insertAtPosition(39,1);
        List.print();
        List.insertAtPosition(3,7);
        List.print();
        List.insertAtPosition(33,4);
        List.print();
        List.insertAtPosition(34,0);
        List.print();
        List.insertAtPosition(13,4);
        List.print();
        List.insertAtPosition(88,55);
        List.print();
        List.insertAtPosition(4,2);
        List.print();
        
        System.out.println("Size of the Linked List : "+List.size());

    }

}