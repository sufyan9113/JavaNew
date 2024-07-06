package DSA.LinkedList;

public class Insertion 
{   
    static Node head;
    public static void main(String[] args) 
    {
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        disp(head);

        insertBeg(5);
        insertBeg(1);
        disp(head);

        insertInd(2, 1);
        disp(head);
        
    }

    public static void insertInd(int val,int ind)
    {
        Node temp=head;
        Node n=new Node(val);
        if(ind==0) insertBeg(val);

        else
        {
            for(int i=0; i<ind-1; i++)
            {
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;

        }
        
        
        
    }
    public static void insertBeg(int val)
    {
        Node n=new Node(val);
        n.next=head;
        head=n;
    }
    public static void insertEnd(int val)
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
