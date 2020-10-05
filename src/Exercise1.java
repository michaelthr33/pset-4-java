import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.00");
        System.out.print("Temperature : ");
        double Temp = in.nextDouble();
        System.out.print("Wind Speed : ");
        double Wind = in.nextDouble();
        double Chill = 35.74 + 0.6215*Temp+(0.4275*Temp-35.75)*Math.pow(Wind,0.16);
        System.out.print("Wind chill : "+Decimal.format(Chill));

    }
}
