public class Striver {
    public static void main(String args[]){
        pattern22(4);
    }
    
    static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col=1; col <= row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
            
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < n; row++){
            for (int col = 1; col <= n-row; col++){
                System.out.print(col+" " );
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row < n; row++){
            //space
            for (int space = 0; space < n-row-1; space++){
                System.out.print(" ");
            }
            //star
            for (int star = 0; star < 2*row+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 0; row < n; row++){
            //space
            for (int space = 0; space < row; space++){
                System.out.print(" ");
            }
            //star
            for (int star = 0; star < 2*(n-row)-1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }

    static void pattern11(int n){
        int start=1;
        for(int row = 0; row < n; row++){
            if(row %2 ==0 ){
                start = 1;
            }
            else{start=0;}
            for(int col = 0; col <=row; col++ ){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int row=1; row<=n ; row++){
            //number
            for (int num=1; num <= row ; num++){
                System.out.print(num+" ");
            }

            //space
            for (int space=0; space<2*(n-row); space++){
                System.out.print("  ");
            }

            //number
            for (int num=row; num>=1; num--){
            System.out.print(num+" ");
            }

            System.out.println();
        }
    }

    static void pattern13(int n){
        int num=1;
        for (int row=1 ; row<=n ; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        
        for (int row=1; row <=n ; row++ ){
            char alp = 'A';
            for (int col=1 ; col<= row; col++){
                System.out.print(alp+" ");
                alp++;
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        
        for (int row=1; row <=n ; row++ ){
            char alp = 'A';
            for (char col=1 ; col<= n-row+1; col++){
                System.out.print(alp+" ");
                alp++;
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        char alp = 'A';
        for (int row=1; row <=n ; row++ ){
            for (int col=1 ; col<= row; col++){
                System.out.print(alp+" ");  
            }
            alp++;
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row=0; row < n ; row++ ){
            //space
            for(int space=0; space < n-row-1; space++){
                System.out.print(" ");
            }
            //aphabet
            char ch='A';
            int breakpoint = ((2*row)+1)/2;
            for (int col=1 ; col<=2*row+1; col++){
                System.out.print(ch);
                if (col<= breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            
            System.out.println();
        }
    }

    static void pattern23(int n){
        /* E
         * DE
         * CDE
         * BCDE
         * ABCDE
         */
    int i, j= 5;
        for (i = n; i >= 1; i--)
        {
            for (j = i; j <= n; j++)
            {
                System.out.printf("%c ", ('A' + j - 1));
            }
            System.out.println("");
        }
  }

  static void pattern18(int n){
    /*E
     * ED
     * EDC
     * EDCB
     * EDCBA
     */
        for (int row = n; row >= 1; row--)
        {
            int alphabet = 64+n ;
            for (int col = n; col >= row; col--)
            {
                System.out.print((char) (alphabet) + " ");
                alphabet--;
            }
            System.out.println();
        }
  }

  static void pattern19half(int n){
    for (int row=0; row<n;row++){
        //star
        for(int star=0; star<n-row; star++){
            System.out.print("*");
        }
        //space
        for(int space =0 ; space<2*row; space++){
            System.out.print(" ");
        }
        //star
        for(int star=0; star<n-row; star++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    static void pattern19otherhalf(int n){
    for (int row=0; row<n;row++){
        //star
        for(int star=0; star <= row; star++){
            System.out.print("*");
        }
        //space
        for(int space =0 ; space<2*(n-1-row); space++){
            System.out.print(" ");
        }
        //star
        for(int star=0; star<=row; star++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    static void pattern19(int n){
        pattern19half(n);
        pattern19otherhalf(n);
    }

    static void pattern20otherhalf(int n){
        for (int row=0; row<n;row++){
            //star
            for(int star=0; star <= row; star++){
                System.out.print("*");
            }
            //space
            for(int space =0 ; space<2*(n-1-row); space++){
                System.out.print(" ");
            }
            //star
            for(int star=0; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20half(int n){
        for (int row=0; row<n-1;row++){
            //star
            for(int star=1; star<n-row; star++){
                System.out.print("*");
            }
            //space
            for(int space =0 ; space<=(2*row)+1; space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<n-row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        pattern20otherhalf(n);
        pattern20half(n);
    }

    static void pattern21(int n){
        for(int row=0; row<n;row++){
            if(row==0 || row==n-1){
                for(int col=0; col<n; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col=0;col<n;col++){
                    if(col==0 || col==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }

    static void pattern22(int n){
        for (int row=0; row<2*n-1; row++){
            for(int col=0; col<2*n-1; col++){
                int top = row;
                int left = col;
                int right = 2*(n-1)-col;
                int bottom = 2*(n-1)-row;
                int atEveryIndex = n - Math.min(Math.min(top,left),Math.min(right,bottom));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }
}

    

    

