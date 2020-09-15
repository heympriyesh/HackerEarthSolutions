import java.util.Scanner;
public class Divisible {

    static void isDivisibleBy11(int[] arr) {
        int n = arr.length/2;
        boolean isAdd = true;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            String s = Integer.toString(num);
        int digit = Integer.parseInt(String.valueOf(s.charAt(0)));
            if(isAdd) {
                sum += digit;
                isAdd = false;
            } else {
                sum -= digit;
                isAdd = true;
            }
        }

        for(int i = n; i < arr.length; i++) {
            int num = arr[i];
            int digit = num%10;
            if(isAdd) {
                sum += digit;
                isAdd = false;
            } else {
                sum -= digit;
                isAdd = true;
            }
        }
        if(sum == 0 || sum == 11) {
            System.out.println("OUI");
        } else {
            System.out.println("NON");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        isDivisibleBy11(arr);
    }
}