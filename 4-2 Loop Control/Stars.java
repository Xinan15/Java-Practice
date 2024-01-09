public class Stars {
    
    public static void main(String[] args) {


        int level = 10;

        for(int i=1;i<=level;i++){

            for(int k=1;k<=level-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if (j==1 || j==2*i-1 || i == level){

                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        

        /*

        Pyramid
            *       1st line: 1 star    2*1-1 ; blank space: 8  2*4
           ***      2nd line: 3 stars   2*2-1 ; blank space: 6  2*3
          *****     3rd line: 5 stars   2*3-1 ; blank space: 4  2*2
         *******    4th line: 7 stars   2*4-1 ; blank space: 2  2*1
        *********   5th line: 9 stars   2*5-1 ; blank space: 0  2*0

         */
    }
}
