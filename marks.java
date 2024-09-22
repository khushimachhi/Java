import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 1st subject:");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks for 2nd subject: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks for 3rd subject: ");
        int marks3 = sc.nextInt();
        
        float avg = (marks1 + marks2 + marks3)/3.0f;
        System.out.println("Percentage:" + avg);
        if(avg>= 40 && marks1>=33 && marks2 >=33 && marks3>=33){
            System.out.println("Congratulations. You have been promoted");
        }
        else{
            System.out.println("Sorry. You have not been promoted");
        }
        
    
}
}