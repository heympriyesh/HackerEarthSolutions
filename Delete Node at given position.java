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
        }else{
            Node last=head;
            
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
    }
    
    public void print()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    public void delete(int pos)
    {
        Node temp=head;
        if(pos==1)
        {
            head=temp.next;
        }
        for(int i=1;temp!=null & i<pos-1;i++)
        {
            temp=temp.next;
        }
        Node curr=temp.next.next;
        temp.next=curr;
    }
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        TestClass tst=new TestClass();

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            tst.insert(data);
        }
        int del=sc.nextInt();
         tst.delete(del);
         tst.print();
    }
}
