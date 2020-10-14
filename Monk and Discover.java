import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int q=sc.nextInt();
       long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++)
        {
            long find;
            find=sc.nextLong();
            int start=0;
            int end=n-1;
            int mid=(start+end)/2;
            while( start <= end )
			{
				if ( arr[mid] < find )
					start = mid + 1;    
				else if ( arr[mid] == find ) 
				{
					System.out.println("YES");
					break;
				}
				else
					end = mid - 1;

				mid = (start + end)/2;
			}
        if(start>end)
            System.out.println("NO");

        }
    }
}
