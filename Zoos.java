
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
	    int z=1,o=1;
	    z+=str.lastIndexOf('z');
	    o+=str.lastIndexOf('o');
	    int dif=o-z;
	    if(z*2==dif)
	        System.out.println("Yes");
	    else
	        System.out.println("No"); 
    }
}
