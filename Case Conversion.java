import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = caseConversion(s);
            System.out.println(out_);
            //System.out.println("");
        }
         wr.close();
         br.close();
    }
    static String caseConversion(String str){
        StringBuilder sb=new StringBuilder();
     sb.append(Character.toLowerCase(str.charAt(0)));
     for(int i=1;i<str.length();i++)
     {
        if(Character.isUpperCase(str.charAt(i)))
        {
            sb.append('_');
            sb.append(Character.toLowerCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
     }
     return sb.toString();
    
    }
}