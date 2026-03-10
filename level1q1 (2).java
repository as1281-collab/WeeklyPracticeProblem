import java.util.Scanner;
public class level1q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter number:");
        num=sc.nextInt();
        if (num%5==0){
            System.out.println("Is the number "+num+" divisible by 5? Yes.");
        }
        else{
            System.out.println("Is the number "+num+" divisible by 5? No.");
        }
        sc.close();
    }
}
