

public class loops {
    public static void main(String[] args) {
        
        /* while loop
        int i=1;
        while ( i <= 10) {
        System.out.println(i);
        i++;
    }
    */

    /* do while loop
    int i=1;
    do{
        System.out.println(i);
        i++;
    }while(i<10);
    */
  /* 
    //for loop ... decrementing
    for (int i = 10; i > 0; i--) {
        System.out.println(i);
    }
    */

    //practice set

    /* 
    int n = 4;
    for( int i=n ; i>0 ; i--){
        for( int j=0;j<i;j++){
        System.out.print("*");
        }
        System.out.print("\n");
    }
        */
         
        /* 
        int sum=0;
        int n=3;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
            System.out.println(sum);

            */
   
            /* 
        int n=2;
        for (int i = 0; i < 11; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
            */

            /* 
        int n=3;
        int i = 1;
        int fact = 1;
        while(i<=n){
            fact = fact * i;
            i++;}
            System.out.println(fact);

        */
        
        int n=8;
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
           sum += n*i;
        }
        System.out.println(sum);


}
}

