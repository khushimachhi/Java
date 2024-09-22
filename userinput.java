import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of numbers is ");
        System.out.println(sum);

    }
    
}
