import java.util.Arrays; 
public class FindMin {
    public static void main(String args[]){
        int[] arr = {1,2,3,9,-7,98};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
        int minimum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    
}
