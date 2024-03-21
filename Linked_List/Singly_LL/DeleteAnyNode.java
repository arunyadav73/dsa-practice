// code to delete any position node from the Linked List
class DeleteAnyNode
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

    // to a node at the last of the linked list
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
            System.out.println("null");
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

    // to delete node of given position, position starts from 1
    void deleteFromPosition(int pos)
    {
        // for emplty linked list
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

        // if linked list have only onle node
        else if(pos==1 && head.next==null)
        {
            head=null;
        }

        // delete first node when linjed list have for then 1 node
        else if(pos==1)
        {
            head=head.next;
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
        }

        // when position = size,deleting last node
        else if(pos==size())
        {
            Node current=head;
            for(int i=2;i<pos;i++)
            {
                current=current.next;
            }
            current.next=null;
        }

        // invalid position
        else
        {
            System.out.println("\nYou Entered wrong position which is greater then size of the Linked List");
            System.out.println("Can not delete node at the position "+pos+"\n");
        }
    }

    public static void main(String[] ar)
    {
        DeleteAnyNode List=new DeleteAnyNode();

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