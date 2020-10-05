import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#.00");
        System.out.println("Side : ");
        double Side = in.nextDouble();
        double Area = ((3 * Math.sqrt(3)) / 2) * Math.pow(Side, 2);
        double Perimeter = Side * 6;
        System.out.println("Area      : "+ Decimal.format(Area));
        System.out.println("Perimeter : " + Decimal.format(Perimeter));
        in.close();


    }
}