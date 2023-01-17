import java.util.Arrays;
public class Search{
    public static void main(String args[]){
        int[] nums = {10,7,25,6,8,4,37,1,98,2,69};
        int target = 37;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);

    }

    //search in the array if the number exist or not
    //if not return -1
    //to return the index of the target
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index < arr.length; index++ ){
            int element = arr[index];
            if(target == element){
                return index;
            }
        }

        return -1;

    }

    //to return the element value
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr ){
            if(target == element){
                return element;
            }
        }

        return Integer.MAX_VALUE;

    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr ){
            if(target == element){
                return true;
            }
        }

        return false;

    }


}
