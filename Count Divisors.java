
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count++;
            }   
        }
        
        System.out.println(count);
        

    }
}
