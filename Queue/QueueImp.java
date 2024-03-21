// Implementation of Queue using array
class QueueImp
{
    int[] data;
    int front;
    int rear;
    int default_size=10;

    QueueImp()
    {
        data=new int[default_size];
        front=rear=-1;
    }

    QueueImp(int size)
    {
        data=new int[size];
        front=rear=-1;
    }

    // checking queue is empty or not
    boolean isNull()
    {
        if(front==-1 && rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // checking queue is full or not
    boolean isFull()
    {
        if(front==0 && rear==data.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // function to push elemnet
    void push(int element)
    {
        if(isFull())
        {
            System.out.println("Queue is full can not insert "+element);
        }
        else
        {
            // inserting in empty queue
            if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
                data[rear]=element;
                System.out.println("Element inserted : "+element);
                return;
            }
            // inserting at last of queue
            else
            {
                rear=rear+1;
                data[rear]=element;  
                System.out.println("Element inserted : "+element);
            }
        }

    }

    // function to pop element from queue
    void pop()
    {
        if(isNull())
        {
            System.out.println("Queue is Empty can not pop");
            return;
        }
        else if(rear==0)
        {
            int removed=data[front];
            front=-1;
            rear=-1;
            System.out.println("Element poped :"+removed);
        }
        else
        {
            int removed=data[front];
            // shifting element of queue
            for(int i=1;i<=rear;i++)
            {
                data[i-1]=data[i];
            }
            rear=rear-1;
            System.out.println("Element poped :"+removed);
        }
    }

    // to find front
    void front()
    {
        System.out.println("front of queue is : "+front);
    }

    // to find rear
    void rear()
    {
        System.out.println("rear of queue is : "+rear);
    }

    // to print queue
    void print()
    {
        if(isNull())
        {
            System.out.println("Queue is Empty ");
            return;
        }
        else
        {
            for(int i=0;i<=rear;i++)
            {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] ar)
    {
        QueueImp queue = new QueueImp(6);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        
        queue.front();
        queue.rear();

        System.out.println(queue.isFull());
        queue.print();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        queue.print();
        queue.front();
        queue.rear();

        queue.pop();
        queue.pop();

        System.out.println(queue.isNull());
        queue.push(14);
        System.out.println(queue.isFull());

        queue.push(41);
        queue.push(54);
        queue.push(16);

        System.out.println(queue.isNull());
        queue.print();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        
        queue.front();
        queue.rear();

    }

}