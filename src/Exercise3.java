import java.text.DecimalFormat;
import java.util.Scanner;



public class Exercise3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal=new DecimalFormat("#.00");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        System.out.print("Length   : ");
        double Length = in.nextDouble();
        System.out.print("Width    : ");
        double Width = in.nextDouble();
        System.out.print("Diameter : ");
        double Radius = in.nextDouble() / 2;
        double Area = Length * Width - Math.PI * Math.pow(Radius, 2);
        System.out.println("\nSurface area : "+Decimal.format(Area));
        in.close();

    }

}