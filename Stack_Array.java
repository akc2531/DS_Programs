import java.util.*;
public class Main
  {
      static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = ob.nextInt();
        Stack a = new Stack(n);
        for(int i=1;i<=n;i++)
        {a.push(ob.nextInt());
        }
        System.out.println("Now Peeking is carried out:--"+a.peek());
        
        System.out.println("Now Printing Starts for first:-");
        a.print();
        System.out.println("Now Popping Operation Starts");
        System.out.println(a.pop()+" ");
        System.out.println(a.pop()+" ");
         System.out.println("Now Printing Remaining value Starts");
        a.print();
    }
  }
class Stack
  {
    int top;
    int arr[];
    int n;
    Stack(int size)
    {
      this.n=size;
      this.arr=new int[this.n];
      this.top=-1;
    }
    void push(int item)
    {
      //Overflow Condition
      if(top>=this.n-1)
        System.out.println("Stack is Overflow");
      else
        this.arr[++top]=item;
    }
    int pop()
    {
      int item;
      //Underflow condition
      if(top<0)
      {
        System.out.println("Stack is Underflow");
        return 0;
      }
      else
      {
        item=this.arr[top--];
        return item;
      }
    }
    int peek()
    {
      int item;
      //Underflow condition
      if(top<0)
      {
        System.out.println("Stack is Underflow");
        return 0;
      }
      else
      {
        item=this.arr[top];
        return item;
      }
    }
    void print()
    {
      for(int i=top;i>=0;i--)
        System.out.println(this.arr[i]);
    }
  }
