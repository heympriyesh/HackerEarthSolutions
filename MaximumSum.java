import java.util.*;

class MaximumSum{
    public static void main(String args[] ) throws Exception {
        
      Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        long arr[] = new long[len];

        for(int i=0;i<len;i++){

        arr[i] = scan.nextInt();

        }

        Arrays.sort(arr);

        long max = arr[len-1];

        int elem_count=1;

        for(int i=len-2;i>=0;i--){

        if(max<= (arr[i]+max) ){

        max += arr[i];

        elem_count++;

        }

        }

        System.out.println(max+" "+elem_count);

    }
}
