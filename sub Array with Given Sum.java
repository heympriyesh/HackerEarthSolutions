import java.util.*;

public class Main {
   
    public static void main(String args[] ) throws Exception {
        int[] arr={1, 2, 3, 7, 5}; 
        int k=12;
        int sum=arr[0];
        int len=arr.length;
        int start=0;
        int end=1;
 // *******Brute Force********
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=arr[i];
        //     for(int j=i+1;j<=arr.length-1;j++)
        //     {
        //         if(sum==k)
        //         {
        //             System.out.println((i+1)+" "+(j));
        //         }
        //         if(sum>k)
        //             break;
                
        //         if(j<arr.length)
        //         {
        //             sum+=arr[j];
        //         }
        //     }
        // }
//********************************

//*******O(n) Solution*********
        while(start<=end)
        {
            while(sum>k && start<end-1)
            {
                sum=sum-arr[start];
                start++;
                System.out.println("The value of start "+start);
            }
            if(sum==k)
            {
                System.out.println(sum);
                System.out.println((start+1)+" "+end);
                break;
            }
            if(end<len)
            {
                sum+=arr[end];
            }
            end++;
        }
    }
}
