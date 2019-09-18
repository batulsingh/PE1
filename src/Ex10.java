import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        String str, strtobeadded="";
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        str = sc.nextLine();
        System.out.print("Enter n :");
        num = sc.nextInt();

        int size = str.length();


        for(int j =size-num; j<size; j++){
            strtobeadded = strtobeadded + str.charAt(j);
        }

        System.out.print(str);
        for(int k=0; k<num; k++)
        System.out.print(strtobeadded);
    }
}
