import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character :");

        char c = sc.next().charAt(0);

        if (c>= 'A' && c<='Z'){
            System.out.println("Uppercase letter");
        }
        else if (c>= 'a' && c<='z'){
            System.out.println("Lowercase letter");
        }
        else if(c>='0' && c<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Symbol");
        }
    }
}
