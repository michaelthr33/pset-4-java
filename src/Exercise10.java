import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Whats your favorite city? ");
        String City = in.nextLine();
        String Upper = City.toUpperCase();
        String Lower = City.toLowerCase();
        int Length = City.length();

        System.out.println("Text   : "+City);
        System.out.println("Length : "+Length);
        System.out.println("Upper  : "+Upper);
        System.out.println("Lower  : "+Lower);

        in.close();


    }
}
