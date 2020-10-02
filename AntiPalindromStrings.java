import java.util.*;

class AntiPalindromStrings{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String str=sc.next();
            StringBuilder pal=new StringBuilder(str);
            String rev=pal.reverse().toString();
            if(rev.equals(str)){
                System.out.println("-1");
            }else{
                char arr[]=rev.toCharArray();
                Arrays.sort(arr);
                String temp=String.valueOf(arr);
                System.out.println(temp);
            }
        }
        
    }
}
