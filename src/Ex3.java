import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word :");
        s = sc.nextLine();

        while(!s.matches("[a-zA-Z]+")){
            System.out.print("Numbers, Spaces and special characters not allowed, Enter again :");
            s = sc.nextLine();
        }

        char[] chararray = s.toCharArray();

        for(int i=0; i < chararray.length; i++ ){
            if(chararray[i] == 'a'|| chararray[i] == 'e'|| chararray[i] == 'i'|| chararray[i] == 'o'|| chararray[i] == 'u'|| chararray[i] == 'A'|| chararray[i] == 'E'|| chararray[i] == 'I'|| chararray[i] == 'O'|| chararray[i] == 'U'){
                System.out.println(chararray[i] + " - vowel");
            }
            else{
                System.out.println(chararray[i] + " - consonant");
            }
        }
    }
}
