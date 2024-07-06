package DSA.LinkedList;

public class PracLL
{
    static Node head;
    public static void main(String[] args) 
    {
        
        insertBeg(5); 
        insertBeg(2);
        insertEnd(10);
        insertEnd(20);
        insertEnd(25);
        insertAny(8, 2);
        disp(head);

        delete(head, 2);
        disp(head);

        reverseIter(head);
        disp(head);

        reverseRec(head,null);
        disp(head);

        middle(head);
        
    }
    public static void insertEnd(int n)
    {
        Node nn=new Node(n);

        if(head==null)
        {
            head=nn;
            return;
        }
        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nn;
        
    }
    public static void insertBeg(int n)
    {
        Node nn=new Node(n);
        nn.next=head;
        head=nn;
    }
    public static void insertAny(int n,int ind)
    {
        Node nn=new Node(n);
        if(ind==0) insertBeg(n);
        Node temp=head;
        for(int i=0; i<ind-1; i++)
        {
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
    }

    public static void delete(Node temp,int ind)
    {
        if(ind==0)
        {
            head=temp.next;
            return;
        }

        for(int i=0; temp.next!=null&&i<ind-1; i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;

        
    }
    public static void reverseIter(Node temp)
    {
        Node cur=temp;
        Node pre=null;
        Node post=null;

        while(cur!=null)
        {
            post=cur.next;
            cur.next=pre;
            pre=cur;
            cur=post;
        }
        head=pre;
        
    }
    public static void reverseRec(Node cur,Node pre)
    {
        if(cur.next==null)
        {
            cur.next=pre;
            head=cur;
            return;
        }
        Node post=cur.next;
        cur.next=pre;
        reverseRec(post,cur);

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
