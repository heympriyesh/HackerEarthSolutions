import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next().toLowerCase();

            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u' ){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
