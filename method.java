import java.util.Scanner;
import java.util.function.ObjDoubleConsumer;
public class method {
    public static void main(String Args[]){

       /* if static keyword is used

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();

       
        int c;
        c = logic(a,b);    //no need for creating objects as static is used
        System.out.println("The difference is = "+c);
 
    }



        static int logic(int x , int y){
            int z;
            if(x>y){
                z=x-y;
            }
            else{
                z=y-x;
            }
            return z;
        }    
             */



        //if static keyword is not used
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();

        int c;
        method obj = new method();  //creating object as static is not used
        c = obj.logic(a,b);
        System.out.println("The difference is = "+c);
 
    }

         int logic(int x , int y){      //without using static
            int z;
            if(x>y){
                z=x-y;
            }
            else{
                z=y-x;
            }
            return z;
        } 

    
}
