import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine(); 
        int x=0,y=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='L'){
                x--;
            }else if(name.charAt(i)=='R'){
                x++;
            }else if(name.charAt(i)=='U'){
                y++;
            }else if(name.charAt(i)=='D'){
                y--;
            }
        }
        System.out.println(x+" "+y);
    }
}
