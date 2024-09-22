public class array {
    public static void main(String[] args) {
        /*int[] marks = new int [5];
        marks [0] = 100; 
        marks [1] = 90;
        marks [2] = 86;
        marks [3] = 95;
        marks [4] = 92;*/

        // int [] marks = {100,90,86,95,92};

        //System.out.println(marks[4]);
       // System.out.println(marks.length);

       /*
       for (int i =0; i <= marks.length; i++){
        System.out.println(marks[i]);
    }
        */
        /* 
        //reverse order
        for (int i = marks.length-1; i >= 0; i--){
            System.out.println(marks[i]);
        }

        //for-each loop
        for(int element:marks){
            System.out.println(element);
        }
        */

        //Multidimensional loop

      //  int [][] marks = { [mango,banana,apple],[java, kotlin,python],[mercedes,porshe,toyota]};

        /*
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        //displaying 2D array
        for(int i=0; i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
                
        }

        System.out.println("");
    }
        */


    //practice set

    /*
    float[] marks = {45.7f , 68.9f , 45.9f, 99.0f , 13.7f};

    float sum = 0;
    for(float element:marks){
        sum+=element;
    }
    System.out.println(sum);

    */

    /* 
    float[] marks = {45.7f , 68.9f , 45.9f, 99.0f , 13.7f};

    float num = 45.7f;
    boolean isInArray = false;
    for(float element:marks){
    if(num==element){
        isInArray = true;
        break;
    }
}
if(isInArray){
    System.out.println("Num is in array");
}
    else{
        System.out.println("Num is not in array");
    }
*/

/* 
float[] marks = {45.7f , 68.9f , 45.9f, 99.0f , 13.7f};

float sum = 0;
for(float element:marks){
    sum+=element;
}
System.out.println(sum);
System.out.println("Average marks:" + sum/marks.length);

*/
 
//printing sum of two matrices

int [][] mat1 = {{1,2,3},
                {4,5,6}};
int [][] mat2 = {{11,2,13},
                {4,7,1}};
      
 int [][] result = {{0,0,0},
                 {0,0,0}};


                 for(int i=0; i<mat1.length;i++){     //row num of times
                    for(int j=0; j<mat1[i].length;j++){  //column num of times
                        System.out.format("Setting value for i=%d and j=%d \n", i, j);
                        result[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }

                for(int i=0; i<mat1.length;i++){     //row num of times
                    for(int j=0; j<mat1[i].length;j++){  //column num of times
                        System.out.print(result[i][j]+ " ");
                        result[i][j] = mat1[i][j] + mat2[i][j];
                    }
                    System.out.println("");
                }


           
}
}
