import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        num = sc.nextInt();

        if(num>20 && num<30){
            if((num % 2) != 0){
                System.out.print("Tom");
            }
            else{
                System.out.print("Jerry");
            }
        }
        else{
            System.out.print("Number doesn't lies between 20 and 30");
        }
    }
}
