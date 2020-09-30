public class Main
{
	public static void main(String[] args) {
	    String str="aba";
	    int sum=0;
	    char[] ch=str.toCharArray();
	    for(int i=0;i<ch.length;i++){
	        sum+=ch[i]-96;
	    }
		System.out.println(sum);
	}
}