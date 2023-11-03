class Queue
{
    int arr[];
    int front;
    int rear;
    int n;
    Queue(int n)
    {
        this.n=n;
        this.front=-1;
        this.rear=-1;
        arr=new int[this.n];
    }

    public void enqueue(int item)
    {
        //Overlfow
        if(this.rear==this.n-1)
            System.out.println("Queue Overflow"); 
        else
        {
            this.arr[++rear]=item;

        }
    }

    public int dequeue()
    {
        if(this.rear==-1)
        {System.out.println("Queue Undeflow");
        }
        else
            this.front=this.arr[0];
        for(int i=0;i<rear;i++)
            this.arr[i]=this.arr[i+1];
        //rear--;
        return front;
    }

    public int peek()
    {
        if(this.rear==-1)
        {System.out.println("Queue Undeflow");
            return -1;
        }
        else
            return this.arr[0];
    }

    void print()
    {
        for(int i=0;i<rear;i++)
        {
            System.out.println(this.arr[i]);
        }
    }
}
