import java.util.*;
public class ChangeValue {
    public static void main(String[] args){
        //creating an array
        int[] arr = {0,1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    
    static void change(int[] nums){
        nums[0]=99;


    }
}
