import java.util.*;

class AliceAndStrings{
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
    HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        
       int l1=str1.length();
       int l2=str2.length();
       int flag=0;
        if(l1==l2)
        {
            for(int i=l1-1;i>=0;i--)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    flag=i;
                    break;
                }
            }  
                for(int j=0;j<=flag;j++)
                {
                    hash.put(str1.charAt(j)-str2.charAt(j),1);
                }
                boolean teru=true;
                for(int key: hash.keySet())
                {
                    if(key>=0)
                        {
                            teru=false;
                            break;
                        }
                }
                if(teru)
                {
                    System.out.println("YES");
                }else
                {
                    System.out.println("NO");
                }
            
        }else{
            System.out.println("NO");
        }
    }
}
