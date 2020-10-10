import java.util.*;

class SavePatients{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] mid=new int[N];
        int[] pat=new int[N];
        int count=0;
        for(int i=0;i<N;i++)
        {
            mid[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            pat[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(mid[i]>pat[i])
                {
                    count++;
                }
        }
        if(count==N){
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }

    }
}
