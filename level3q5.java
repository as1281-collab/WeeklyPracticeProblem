import java.util.Scanner;
public class level3q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swapped numbers are "+num1+" and "+num2+".");
        scanner.close();
    }
}