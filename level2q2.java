import java.util.Scanner;
public class level2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base of triangle in cm:");
        float base=scanner.nextFloat();
        System.out.println("Enter height of triangle in cm:");
        float height=scanner.nextFloat();
        double area_cm=0.5*base*height;
        double base_inch=base/2.54;
        double height_inch=height/2.54;
        double area_inch=0.5*height_inch*base_inch;
        System.out.println("The area of the triangle in sq. inches is "+area_inch+" and sq. cm is "+area_cm+".");
        scanner.close();
    }
}