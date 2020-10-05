import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First name : ");
        String FirstName = in.nextLine();
        System.out.print("Middle name : ");
        String MiddleName = in.nextLine();
        System.out.print("Last name : ");
        String LastName = in.nextLine();

        String FirstInitial =FirstName.substring(0,1);
        String MiddleInitial = MiddleName.substring(0,1);
        String LastInitial = LastName.substring(0,1);

        System.out.println(FirstInitial.toUpperCase()+MiddleInitial.toUpperCase()+LastInitial.toUpperCase());
        in.close();


    }
}
