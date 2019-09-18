import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        String original, reversed = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        original = sc.nextLine();

        int size = original.length();

        for(int i= size-1 ; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);
    }
}