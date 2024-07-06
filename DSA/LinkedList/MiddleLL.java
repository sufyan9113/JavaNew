package DSA.LinkedList;

public class MiddleLL 
{
    static Node head;
    public static void main(String[] args) 
    {
        
        insert(1);
        insert(5);
        insert(6);
        insert(10);
        insert(25);
       // insert(30);
        disp(head);

        middle(head);

    }
    public static void middle(Node temp)
    {
        Node slow=temp;
        Node fast=temp;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }
    public static void insert(int val)
    {
        Node n=new Node(val);

        if(head==null)
        {
            head=n;
            return;
        }

        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }

    public static void disp(Node temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Node
{
    int val;
    Node next;

    Node(int val)
    {
        this.val=val;
    }
}

