public class Ceiling{
    public static void main(String args[]){
        int[] arr = {-99,-86,-8,-3,0,2,6,7,9,15,20,65,78,96,99};
        int target=79;
        int ans =ceilingNo(arr , target);
        System.out.println(ans);
    }

    //return index of the smallest element >= target

    static int ceilingNo(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1]){
            return -1;
        } 
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
        return start;
    }
}