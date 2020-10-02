import java.util.*;

class ArrayInsert{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int arr[]=new int[N];
        int query[]=new int[3];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++){
            for(int j=0;j<3;j++){
                query[j]=sc.nextInt();
            }
            if(query[0]==1){
                int s=query[1];
                int p=query[2];
                arr[s]=p;
            }
            if(query[0]==2){
                int s=query[1];
                int p=query[2];
                int sum=0;
                for(int k=s;k<=p;k++){
                    sum+=arr[k];
                }
                if(sum<=100000){
                    System.out.println(sum);
                }else
                    System.out.println("-1");
            }
        }
    }
}
