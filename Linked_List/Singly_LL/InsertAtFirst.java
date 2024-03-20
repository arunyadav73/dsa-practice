// Here we write code to add an node at starting of the linked list
class InsertAtFirst
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

    // funtion to add node at first position
    void insertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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
            System.out.println("End");
        }
    }

    public static void main(String[] args)
    {
        InsertAtFirst List= new InsertAtFirst();
        List.insertAtFirst(1);
        List.insertAtFirst(2);
        List.insertAtFirst(3);
        List.insertAtFirst(4);
        List.insertAtFirst(5);

        List.print();
        
    }

}