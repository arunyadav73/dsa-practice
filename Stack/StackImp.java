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

    void print()
    {
        if(isNull())
        {
            System.out.println("Stack is Empty ");
            return;
        }
        else
        {
            int current =top;
            while(current != -1)
            {
                System.out.println(data[current]);
                current--;
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
        System.out.println(stack.isNull());

    } 

}