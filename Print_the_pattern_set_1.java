import java.util.*;
public class Print_the_pattern_set_1
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int copy =n;

    while(n>0)
    {
    int j =0;
    int a = copy;
        while(a > 0)
        {
            System.out.print(a+" ");
            j++;
            
            if(j%n == 0)
                {
                a--;
                }
        }
            System.out.print("$");
            n--;
    }
    
	    
	}
}
