import java.util.Scanner;
public class level2q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the parameter of the square:");
        float parameter=scanner.nextFloat();
        float side=parameter/4;
        System.out.println("The length of the side is "+side+" whose parameter is "+parameter+".");
        scanner.close();
    }
}