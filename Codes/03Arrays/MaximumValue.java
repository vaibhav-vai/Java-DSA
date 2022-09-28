import java.util.Arrays;
public class MaximumValue {
    public static void main(String[] args){
        int[] arr={1,9,2,8,10};

        System.out.println(max(arr));
        System.out.println(maxRange(arr , 1 , 3));
    }

    //imagine that the array is not empty
    static int max (int[] arr){

        if (arr.length == 0){
            return -1;
        }
        
        int maxval = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    
    //for finding maximum value in range
    static int maxRange (int[] arr , int start , int end){

        if (end < start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxval = arr[0];
        for(int i = start; i < end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
