import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String args[]){
        int [][] arr = {
            {34},
            {98,65,9,84},
            {9,68,15},
            {99,5,35}
        };
        int target = 68;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int [][] arr, int target){
        for(int row=0; row<arr.length ; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    /*static int max(int [][] arr){
        int ans=Integer.MIN_VALUE;
        for(int row=0; row<arr.length ; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] > ans){
                    ans=arr[row][col];
                }
            }
        }
        return ans;
    }*/

    static int max(int [][] arr){
        int ans=Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element > ans){
                    ans=element;
                }
            }
        }
        return ans;
    }
}
