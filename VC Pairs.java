import java.util.Scanner;


 

public class CodeChallenge13_VCPairs {


 

    public static void main(String[] args)

    {

        //System.out.println("Enter the number of times you want to run the flow");

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        if(t>=1&&t<=1000000)

        {

            for(int j=1;j<=t;j++)

            {

                //System.out.println("Enter the length of the string");

                int n=sc.nextInt();

                if(n>=1&&n<=10000000)

                {

                    //System.out.println("Enter the string");

                    String st=sc.next();

                    int count=0;

                    char[] ch=st.toCharArray();

                    for(int i=0;i<ch.length-1;i++)

                    {

                        if(!((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')))

                        {

                            if((ch[i+1]=='a')||(ch[i+1]=='e')||(ch[i+1]=='i')||(ch[i+1]=='o')||(ch[i+1]=='u'))

                            {

                                count++;

                            }

                            else

                                continue;

                        }

                        else

                            continue;

                    }

                    System.out.println(count);

                }

            }

        }

        sc.close();

    }

}