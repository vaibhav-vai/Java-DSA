import java.util.Arrays;
public class Reverse {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
     }
}

// Or 

/*
int[] arr = {1,2,3,4,5,6};
int l = arr.length;
int n = Math.floorDiv(1,2);

for(int i = 0 ; i<n ; i ++){
    //swap a[i] and a[l-1-i] 
    temp = arr[i];
    arr[i] = arr[l-1-i];
    arr[l-1-i] = temp;
} 

for(int element: arr){
    System.out.print(element + "");
}
 */
