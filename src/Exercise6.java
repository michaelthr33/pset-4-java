import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#.00");
        System.out.print("Length : ");
        double Length = in.nextDouble();
        System.out.print("Width : ");
        double Width = in.nextDouble();
        double Area = Length*Width;
        double Perimeter = (2*Length) + (2*Width);
        double Diagonal = Math.sqrt(Math.pow(Length,2)+Math.pow(Width,2));

        System.out.println("Area      : "+Decimal.format(Area));
        System.out.println("Perimeter : "+ Decimal.format(Perimeter));
        System.out.println("Diagonal  : "+Decimal.format(Diagonal));
        in.close();
    }
}