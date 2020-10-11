import java.util.*;
class PlayWithNumbers{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int q=sc.nextInt();
       long arr[] =new long[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextLong();
       }
       while(q-->0)
       {
           int l=sc.nextInt();
           int r=sc.nextInt();
            int loop=(r-l)+1;
           long sum=0;
           for(int i=l-1;i<r;i++)
           {
               sum+=arr[i];
           }
           int mean=(int)(sum/loop);
          System.out.println(mean);
           
       }

    }
}
