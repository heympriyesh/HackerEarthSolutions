import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
             int green=sc.nextInt();
             int purple=sc.nextInt();
             int N=sc.nextInt();
             int[][] arr=new int[N][2];
             int gree1=0,purp1=0,gree2=0,purp2=0;
                for(int i=0;i<N;i++){
                    for(int j=0;j<2;j++){
                        arr[i][j]=sc.nextInt();

                        if(j==0){
                            gree1+=arr[i][j]*green;
                        }else{
                            purp1+=arr[i][j]*purple;
                        }
                        if(j==0){
                            purp2+=arr[i][j]*purple;
                        }else{
                            gree2+=arr[i][j]*green;
                        }
                    }
                }

                    if((gree1+purp1)>(gree2+purp2)){
                        System.out.println(gree2+purp2);
                    }else
                    {
                        System.out.println(gree1+purp1);
                    }
            T--;
        }                
       

    }
}
