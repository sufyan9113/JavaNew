package DSA.LinkedList;

public class Cycle 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        Node n=new Node(50);
        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
        n.next=head;

        detect(head);
       
    }

    public static void detect(Node temp)
    {
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("cycle detected");
        }
        else
        {
            System.out.println("cycle not detected");
        }
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
