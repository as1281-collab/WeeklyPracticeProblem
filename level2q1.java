import java.util.Scanner;
public class level2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1:");
        num1=scanner.nextInt();
        System.out.println("Enter number 2:");
        num2=scanner.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int mult=num1*num2;
        int div=num1/num2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+sub+", "+mult+" and "+div+".");
        scanner.close();
    }
}