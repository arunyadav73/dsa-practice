// Here we write code to add an node between two nodes of the linked list
class InsertAtAnyPosition
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

    // to at a node between two nodes of the linked list
    // here we pass position number of the new node to be added as pos
    void insertAtPosition(int data,int pos)
    {   
        //creating new node
        Node newnode = new Node(data);

        // if Linked is empty
        if(head==null)
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
            head=newnode;
        }
        // inser at bitween nodes
        else if(pos<=size())
        {
            Node current=head;
            for(int i=2;i<pos;i++)
            {
                current=current.next;
            }
            newnode.next=current.next;
            current.next=newnode;
        }
        // insert at last
        else if(pos==size()+1)
        {
            Node current=head;
            while(current.next  != null)
            {
                current =current.next;
            }
            current.next=newnode; 
        }
        // if position is invalid
        else
        {
           System.out.println("\nYou Entered wrong position which is greater then size of the Linked List");
           System.out.println(data + " can not added at the position "+pos+"\n");
        }
    }

    // to find size of the Linked List
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

    // to print Lined List
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
            System.out.println("End");

        }
    }

    public static void main(String[] args)
    {
        InsertAtAnyPosition List= new InsertAtAnyPosition();
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
        List.insertAtPosition(6,6);
        List.print();
        List.insertAtPosition(721,0);
        List.print();
        List.insertAtPosition(67,6);
        List.print();
        List.insertAtPosition(11,55);
        List.print();
        List.insertAtPosition(14,1);
        List.print();
        List.insertAtPosition(3,19);
        List.print();
        List.insertAtPosition(55,3);
        List.print();
        List.insertAtPosition(99,0);
        List.print();
        List.insertAtPosition(99,4);
        List.print();
        System.out.println("Size of the Linked List : "+List.size());
    }

}