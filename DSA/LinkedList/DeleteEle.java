package DSA.LinkedList;

public class DeleteEle 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(1);
        insert(5);
        insert(6);
        insert(10);
        insert(25);
        disp(head);

        delete(head, 2);
        disp(head);

    }

    public static void delete(Node h,int ind)
    {
        Node temp=h;
        if(ind==0)
        {
            head=temp.next;
          
        }
        for(int i=0; temp!=null&&i<ind-1;i++)
        {
            temp=temp.next;
            
        }
            if(temp==null && temp.next== null) return;
            
            temp.next=temp.next.next;
            




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
