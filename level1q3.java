import java.util.Scanner;
public class level1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Is the first number the largest? Yes");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? No");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the second number the largest? Yes");
            System.out.println("Is the third number the largest? No");
        }
        else if (num3>num2 && num3>num2){
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? Yes");
        }
        sc.close();
    }
}