import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#.00");
        System.out.print("Diameter: ");
        double Diameter = in.nextDouble();
        double Radius = Diameter/2;
        double Area = Radius*Radius*Math.PI;
        double Circumference = Diameter*Math.PI;


        System.out.println("Area          : "+Decimal.format(Area));
        System.out.println("Circumference : "+ Decimal.format(Circumference));

        in.close();
    }
}