package DSA.LinkedList;

public class ReverseList
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

        reverseIter(head);
        disp(head);

        reverseRec(head,null);
        disp(head);
    }
    public static void reverseRec(Node curr,Node pre)
    {
       if(curr.next==null)
       {
        head=curr;
        curr.next=pre;
        return;
       }
       
       Node post=curr.next;
       curr.next=pre;
       reverseRec(post, curr);
    }
    public static void reverseIter(Node temp)
    {
        Node cur=head;
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





