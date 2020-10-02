import java.util.*;

class RotateElementByk{
    public static void rotateByK(int[] arr, int k){
            int len=arr.length;
            k=k%len;
            reverse(0,len-k-1,arr);
            reverse(len-k,len-1,arr);
            reverse(0,len-1,arr);
    }
    public static void reverse(int start,int end,int[] arr){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {

                int N=sc.nextInt();
                int K=sc.nextInt();
                int[] A= new int[N];
                //int[] P=new int[N];
                for(int i=0;i<N;i++)
                {
                    A[i]=sc.nextInt();
                }
               
                rotateByK(A,K);
                for(int i=0;i<A.length;i++)
                    System.out.print(A[i]+" ");
                T--;
           
        }
    }
        
        
    }

