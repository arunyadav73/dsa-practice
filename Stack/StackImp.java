// Implementation of Stack using array
class StackImp
{
    int[] data;
    int default_size=10;
    int top;
    StackImp()
    {
        data=new int[default_size];
        top=-1;
    }
    StackImp(int size)
    {
        data=new int[size];
        top=-1;
    }

    // checking stack is empty or not
    boolean isNull()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // checking stack is full or not
    boolean isFull()
    {
        if(top==data.length-1)
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
            System.out.println("Stack is full can not insert "+element);
            return;
        }
        else
        {
            top=top+1;
            data[top]=element;
            System.out.println("Element insert : "+element);
        }
    }

    // function to pop element from queue
    void pop()
    {
        if(isNull())
        {
            System.out.println("Stack is Empty can not pop");
            return;
        }
        else
        {
            int removed=data[top];
            top=top-1;
            System.out.println("element poped : "+removed);
        }
    }

    // to print peak element 
    void peak()
    {
        if(isNull())
        {
            System.out.println("Stack is Empty not have an peak");
            return;
        }
        else
        {
            System.out.println("Peak element : "+data[top]);
        }

    }

    // to find top
    void top()
    {
        System.out.println("Top of stack is : "+top);
    }

    // to print stack
    void print()
    {
        if(isNull())
        {
            System.out.println("Stack is Empty");
            return;
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] ar)
    {
        StackImp stack =new StackImp(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.top();
        stack.pop();
        System.out.println(stack.isNull());

        stack.push(5);
        stack.push(6);
        stack.push(11);
        stack.push(12);

        System.out.println(stack.isFull());
        stack.peak();

        stack.push(7);
        stack.push(8);
        stack.top();

        stack.print();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        stack.print();
        stack.pop();

        stack.push(9);

        stack.pop();

        stack.push(23);
        stack.peak();

        stack.pop();
        stack.pop();
        stack.pop();

        stack.print();
        stack.top();
        System.out.println(stack.isNull());

    } 

}