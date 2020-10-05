import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#");
        System.out.print("Centimeter: ");
        int Centi = in.nextInt();
        int Kilo = Centi / 100000;
        int KiloLeftover = Centi % 100000;
        int Meter = KiloLeftover / 100;
        int MeterLeftover = KiloLeftover % 100;

        System.out.println("Kilometers  : "+Kilo);
        System.out.println("Meters      : "+ Meter);
        System.out.println("Centimeters : "+Decimal.format(MeterLeftover));

        in.close();
    }
}