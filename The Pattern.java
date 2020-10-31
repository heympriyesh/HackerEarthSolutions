import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
      int n=sc.nextInt();
      int k=sc.nextInt();
      String arr[]=new String[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.next();
      }
      char[] ch=arr[n-1].toCharArray();
      System.out.println(ch[k-1]);
        }
    }
}
