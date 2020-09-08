import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int N=sc.nextInt();
        while(N>0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w < l || h < l){

                System.out.println("UPLOAD ANOTHER");

            }else if(w >= l && h >= l){

                if(w==h){

                    System.out.println("ACCEPTED");

                }else{

                    System.out.println("CROP IT");

                }
            }
            N--;
        }
       
    }
    }
