import java.util.Scanner;
public class level1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println("Is the first number the smallest? Yes");
        }
        else {
            System.out.println("Is the first number the smallest? No");
        }
        sc.close();
    }
}
