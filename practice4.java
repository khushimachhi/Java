public class practice4 {
/* 
//multiplication
    static void multiplication(int n){
        for (int i = 1; i <=10; i++) {
            System.out.format("%d x %d = %d",n , i, n*i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //problem 1
        multiplication(5);
    }
    
}
*/
/*  
//pattern
static void pattern(){
    for(int i=1; i<=4;i++){
        for(int j=1; j<=i;j++){
            System.out.print("* ");
    }
    System.out.println();
}
}
public static void main(String[] args) {
    pattern();
}
}
 */


  //sum of natural numbers
  static int sumRe(int n){
   if(n == 1){
    return 1;
   }
   else{
    return n + sumRe(n-1);
   }
  }

  public static void main(String[] args) {
     int c = sumRe(5);
      System.out.println("The sum of first 10 natural numbers is " + c);
  }
}