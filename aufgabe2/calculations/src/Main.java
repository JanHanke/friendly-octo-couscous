import java.awt.*;
import java.util.Locale;
import java.util.Random;

public class Main {
    final static double RADIUS = 20;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // damit double mit Punkt ausgeben werden
        printPointsForY0(0,20);
        printPointsForY0(5,18);
        printPointsForY0(10,15);
        printPointsForY0(15,10);
        printPointsForY0(20,5);
    }

    public static void printPointsForY0(double hoeheInMetern, double radius){
        // x^2 + y^2 + z^2 = r^2
        //       y^2 + z^2 = r^2 - x^2
        //             z^2 = r^2 - x^2 - y^2
        //               z = Wurzel (r^2 -  x^2 - y^2)
        for (double z = -radius; z <= radius; z = z + (2*radius)/8) {
                double x = Math.sqrt(radius * radius - (z * z));
                if(x >= 0){
                    System.out.println(String.format("%.2f", x) + " " + hoeheInMetern + " " + String.format("%.2f", z));
                }
        }
        System.out.println();
    }


}
