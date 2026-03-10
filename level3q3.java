import java.util.Scanner;
public class level3q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary and bonus:");
        float salary=scanner.nextFloat();
        float bonus=scanner.nextFloat();
        float total_income=salary+bonus;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+total_income+".");
        scanner.close();
    }
}