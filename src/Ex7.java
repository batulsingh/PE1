import java.util.Scanner;
import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");

        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        int digit,sum=0,reversed=0;
        int length = s.length();
        int[] arrofint = new int[length];

        for(int i =0; i<length ; i++){
             arrofint[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        Arrays.sort(arrofint);

        System.out.print("Sorted number in decreasing order :");
        for(int j =length-1; j>=0 ; j--){
            System.out.print(arrofint[j]);
        }

        System.out.print('\n');

        while (num != 0) {
            digit = num % 10;

            if ((digit) % 2 == 0) {
                sum = sum + (num % 10);
            }
            reversed = (reversed * 10) + digit;
            num /= 10;
        }

        System.out.println("Sum is :" + sum);

            if (sum > 15) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

    }
}
