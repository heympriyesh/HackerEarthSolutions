import java.util.*;
class Aman&MrSharma{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
         int toffee=0;
        while(d-->0)
        {
            int radius=sc.nextInt();
            int horlicks=sc.nextInt(); 
           double distance = 2 * (22/7.0) * radius;  
           if(distance <= horlicks * 100.0) { 
               toffee++; 
           } 

        }
        System.out.println(toffee);

        

    }
}
