import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String village=sc.next();
        if(village.contains("HH")){
        System.out.println("NO"); 
        }else if(village.contains(".")){
        village=village.replace('.','B');
        System.out.println("YES"); 
        System.out.println(village); 
        }else if(village.contains("H")){
        System.out.println("YES"); 
        System.out.println(village); 
        }

    }
}
