import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
       /* 
        //if-else
        int age = 7;

        if(age>=18){
            System.out.println("Tou are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
      */

      /* 
      //if-elseif-else

      System.out.print("Enter age: ");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();

        if (age>56){
            System.out.println("You are a senior citizen ");
        }

        else if (age>30) {
            System.out.println("You are an adult");
        }

        else if (age>18){
            System.out.println("You are a youth");
        }

        else if (age>13) {
            System.out.println("You are a teen");
        }

        else{
            System.out.println("You are a kid");
        }

        */

        System.out.print("Enter age: ");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();

      switch(age){
        case 18:
        System.out.println("You are going to become an adult");
        break;
        case 23: 
        System.out.println("You are going to get a job");
        break;
        case 60:
        System.out.println("You are going to retire");
        break;
        default:
        System.out.println("Enjoy your life!");
      }

    }
    
}
