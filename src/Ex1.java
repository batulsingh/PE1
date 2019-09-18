import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int num, digit, pnum, reversed = 0, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        num = sc.nextInt();
        pnum = num;

        while (num != 0) {
            digit = num % 10;

            if ((digit) % 2 == 0) {
                sum = sum + (num % 10);
            }
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        if (pnum == reversed) {
            if (sum > 25) {
                System.out.print(pnum + " is palindrome and sum of even numbers is greater than 25");
            } else {
                System.out.print(pnum + " is palindrome and sum of even numbers is less than 25");
            }
        }
        else {
            System.out.print(pnum + " is not a palindrome");
        }
    }
}
