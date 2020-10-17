
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String str=sc.next();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
if(str.charAt(i)=='(' || str.charAt(i)=='{' ||  str.charAt(i)=='[')
		    {
		        st.push(str.charAt(i));
		    }
		    else if(!st.empty()&&(
		        (str.charAt(i)==')' && st.peek()=='(')||
		        (str.charAt(i)==']' && st.peek()=='[')||
		        (str.charAt(i)=='}' && st.peek()=='{'))){
		            st.pop();
		        }
		    else{
		        st.push(str.charAt(i));
		    }
		}
		if(st.empty()){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
    }
	}
}