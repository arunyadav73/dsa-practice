// Here we write code to add an node at Last of the linked list
class InsertAtLast
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

    // to insert a node at last of linked list
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

    public static void main(String[] args)
    {
        InsertAtLast List= new InsertAtLast();
        List.insertAtLast(1);
        List.insertAtLast(2);
        List.insertAtLast(3);
        List.insertAtLast(4);
        List.insertAtLast(5);

        List.print();
        
        
    }

}