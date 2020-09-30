import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int patlu=0,motu=0;
       
        for(int i=1;true;i++)
            {
                patlu=i;
                N=N-patlu;
                if(N<=0){
                    System.out.println("Patlu");
                    break;
                }
                motu=i*2;
                N=N-motu;
                if(N<=0){
                    System.out.println("Motu");
                    break;
                }
            
            }
        }

    }

