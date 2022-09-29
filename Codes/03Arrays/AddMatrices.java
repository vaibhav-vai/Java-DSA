// Create a program to add 2 matrices of 2*3

public class AddMatrices {
    public static void main(String [] args){
        int[][] m1 = {
                     {1,2,3},
                     {4,5,6}};

        int[][] m2 = {
                     {6,5,4},
                     {3,2,1}};

        int[][] result = {
                     {0,0,0},
                     {0,0,0}};

        for(int i = 0; i<m1.length;i++){  // row number of times
            for(int j = 0; j<m1[i].length;j++){ //column number of times
                //System.out.format(" Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = m1[i][j] + m2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
