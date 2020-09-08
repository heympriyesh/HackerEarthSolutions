import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       while(T>0){

            int sno=sc.nextInt();

           if(sno%12==0){
               System.out.print(sno-11);
               System.out.println(" WS");
           }else if(sno%12==1){
               System.out.print(sno+11);
               System.out.println(" WS");
           }else if(sno%12==2){
               System.out.print(sno+9);
               System.out.println(" MS");
           }else if(sno%12==3){
               System.out.print(sno+7);
               System.out.println(" AS");
           }else if(sno%12==4){
               System.out.print(sno+5);
               System.out.println(" AS");
           }else if(sno%12==5){
               System.out.print(sno+3);
               System.out.println(" MS");
           }else if(sno%12==6){
               System.out.print(sno+1);
               System.out.println(" WS");
           }else if(sno%12==7){
               System.out.print(sno-1);
               System.out.println(" WS");
           }else if(sno%12==8){
               System.out.print(sno-3);
               System.out.println(" MS");
           }else if(sno%12==9){
               System.out.print(sno-5);
               System.out.println(" AS");
           }else if(sno%12==10){
               System.out.print(sno-7);
               System.out.println(" AS");
           }else if(sno%12==11){
               System.out.print(sno-9);
               System.out.println(" MS");

           }
           
           T--;
       }

    }
}
