// creating an empty Linked List
class EmptySinglyLL
{

    Node head;      // head of the Linked List
    class Node
    {
        int data;
        Node next;

        Node()
        {
            
        }

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    void Create()
    {
        Node newNode = new Node();
        System.out.println("This is an empty integer Linked List");
        System.out.println(newNode.data);
        System.out.println(newNode.next);
    }

    public static void main(String[] args)
    {
        EmptySinglyLL List= new EmptySinglyLL();
        List.Create();
        
    }
}