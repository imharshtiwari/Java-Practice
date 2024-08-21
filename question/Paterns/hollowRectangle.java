public class hollowRectangle {
    public static void main(String[] args) {  //  *****
                                              // *     *  This will be the expected outcome
                                              // *     *
                                              //  *****
     int  n = 5; // number of rows
     int  m = 20; // number of columns

     for (int i = 1; i <= n; i++) {   //This loop is for rows
        for (int j = 1; j <= m; j++) {     //This is for columns 
            if (i == 1 || j == 1 || i == n || j == m ){
                System.out.print(" *");
                } else  {
                    System.out.print("  ");
                    }
                    }

                System.out.println();
        }
            }

    
}
