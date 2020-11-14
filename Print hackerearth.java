import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        String ch="hackerearth";
    
    int arr[]=new int[11];
        for(int i=0;i<11;i++)
        {
      int count=0;
            for(int j=0;j<n;j++)
            {
                if(ch.charAt(i)==str.charAt(j))
                    count++;
            }
            arr[i]=count;
        }
        arr[0] /= 2;
       arr[1] /= 2;
       arr[4] /= 2;
       arr[5] /= 2;
       Arrays.sort(arr);
      System.out.println(arr[0]);
        
       

    }
}
