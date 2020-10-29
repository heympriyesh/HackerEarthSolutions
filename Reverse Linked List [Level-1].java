import java.util.*;
public class TestClass {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void insert(int data)
    {
        Node new_node=new Node(data);
        new_node.next=null;
        if(head==null)
        {
            head=new_node;
        }else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    public void reverse()
    {
        Node prev=null;
        Node current=head;
        Node nextt=null;
        while(current!=null)
        {
            nextt=current.next;
            current.next=prev;
            prev=current;
            current=nextt;
        }
        head=prev;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[] ) throws Exception {
        TestClass tst=new TestClass();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            tst.insert(data);
        }
        tst.reverse();
        tst.print();
    }
}
