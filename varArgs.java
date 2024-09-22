public class varArgs {

    /* 
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    */

    /* 
    

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
     */
     

     //if we want atleast one value compulsory
    static int sum(int x, int ...arr){
        int result = x;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varArgs");
        //System.out.println("Sum of nothing is "+sum());
        System.out.println("The sum is "+sum(10,20,30,40,50,60,70,80,90,100));
    }
    
}
