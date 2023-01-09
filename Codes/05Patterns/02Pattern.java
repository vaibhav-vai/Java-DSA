public class Pattern{
    public static void main(String args[]){
        pattern31(4);
    }

    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            //for number of rows
            for(int col=1;col<=n;col++){
                //for number of columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            int i=1;
            for(int col=1;col<=row;col++){
                
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        /*for(int row=1; row<(2*n) ;row++){
            if (row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }
            else{
                for(int col=1;col<((2*n)-row)+1;col++){
                System.out.print("* ");
            }

            }
            System.out.println();
        }*/
        for(int row=0; row < 2*n; row++) {
            int totalCOlsInROw = row > n ? 2*n - row: row;
            for(int col=0; col< totalCOlsInROw; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=0; row < 2*n; row++) {
            int totalCOlsInRow = row > n ? 2*n - row: row;

            int noOfSpaces = n-totalCOlsInRow;
            for(int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col=0; col<totalCOlsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            
            for(int space = 0 ; space < n - row; space++ ){
            System.out.print("  ");
            }

            for (int col = row ; col >= 1 ;col--){
                System.out.print(col+" ");
            }

            for (int col = 2 ; col <=row ;col++){
                System.out.print(col+" ");
            }
            
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2*n; row++) {
            
            int c = row > n ? 2*n - row: row;

            for(int space = 0 ; space < n - c ; space++ ){
            System.out.print("  ");
            }

            for (int col = c ; col >= 1 ;col--){
                System.out.print(col+" ");
            }

            for (int col = 2 ; col <= c ;col++){
                System.out.print(col+" ");
            }                                                                           
            
            System.out.println();
        }
    }

    static void pattern31(int n){
        int original = n;
        n = 2*n;
        for (int row = 0; row <=n ; row++){
            for (int col = 0; col<=n; col++ ){
                int atEveryIndex = original - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();
        }
    }


}
