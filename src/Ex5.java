import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide input :");
        String s = sc.nextLine();
        String[] arrofstr = s.split(" ", 8);

        int length = arrofstr.length;

        int[] arrint = new int[length];

        for (int i = 0; i < length; i++) {
            arrint[i] = Integer.parseInt(arrofstr[i]);
        }

        for (int j = 0; j < length; j++) {
            sum += arrint[j];
        }
        System.out.print(sum);
    }

}
