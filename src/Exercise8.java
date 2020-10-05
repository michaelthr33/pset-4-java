
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Text : ");
        String Text = in.nextLine();
        int Length =Text.length();
        int Half = Length/2;
        String FirstHalf =Text.substring(0,Half);
        String SecondHalf = Text.substring(Half,Length);

        System.out.println(SecondHalf.toUpperCase() + FirstHalf.toUpperCase());
        in.close();


    }
}
