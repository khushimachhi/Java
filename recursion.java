public class recursion{
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial 5 is "+factorial(n));
    }

    static int factorial(int n){
        //factorial (n) =n*n-1*...1
        //factorial (n)= n*factorial(n-1)

        if(n==0 || n==1){
            return 1;
        } 
        else{
            return n*factorial(n-1);
        }
        
    }
}