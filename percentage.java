
import java.util.Scanner;

//calculating percentage

public class percentage {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        System.out.print("CNND: ");
        double a = sc.nextDouble();
        System.out.print("OS :");
        double b = sc.nextDouble();
        System.out.print("DBMS: ");
        double c = sc.nextDouble();
        System.out.print("COA: ");
        double d = sc.nextDouble();
        System.out.print("DSA: ");
        double e = sc.nextDouble();

        double part = a + b + c + d + e;
        double percent = (part/500) *100;

        System.out.print("The percentage is:" + percent +"%");

        double cgpa =(a + b + c + d + e)/50;
        System.out.print("The cgpa is: " + cgpa);
    }
}
