public class BinarySearch{
    public static void main(String args[]){
        int[] arr = {-99,-86,-8,-3,0,2,6,7,9,15,20,65,78,96,99};
        int target=78;
        int ans =binarySearch(arr , target);
        System.out.println(ans);
    }

    //return index
    //return -1 if target doesn't exist in array
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
         
        while(start <= end){
            // find the middle 
           // int mid = (start + end) / 2;   might be possible that (start + end) exceeds the range of int in java
            int mid = start +(end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}