import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
                s.pop();
            
            if(s.empty())
                arr1[i]=-1;
            else
                arr1[i]=s.peek();
        
            s.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");}
    }
}
