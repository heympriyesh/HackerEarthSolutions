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
    public void insertAt(int data, int k)
    {
        Node new_node=new Node(data);
        new_node.next=null;
        Node current=head;
        int index=1;
        while(index<k)
        {
            current=current.next;
            index++;
        }
        new_node.next=current.next;
        current.next=new_node;
    }
    public void print()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
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
        int add=sc.nextInt();
         int k=sc.nextInt();
         tst.insertAt(add,k);
         tst.print();
    }
}
