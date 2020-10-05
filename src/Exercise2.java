import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#");
        System.out.print("Inches: ");
        int Inches = in.nextInt();
        int Miles = Inches / 63360;
        int MilesLeftover = Inches % 63360;
        int Feet = MilesLeftover / 12;
        int FeetLeftover = MilesLeftover % 12;

        System.out.println("Miles  : "+Miles);
        System.out.println("Feet   : "+ Feet);
        System.out.println("Inches : "+Decimal.format(FeetLeftover));

        in.close();
    }
}