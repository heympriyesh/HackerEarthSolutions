import java.util.*;

class DigitProblem{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long x=sc.nextLong();
        int k=sc.nextInt();
        String str=""+x;
        char arr[]=str.toCharArray();
        for(int i=0;i<k;i++)
        {
            if(arr[i]=='9')
                k++;
            else
                arr[i]='9';
        }
        String s="";
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        System.out.println(s);
    }
}
