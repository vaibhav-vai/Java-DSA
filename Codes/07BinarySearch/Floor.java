public class Floor{
    public static void main(String args[]){
        int[] arr = {-99,-86,-8,-3,0,2,6,7,9,15,20,65,78,96,99};
        int target=78;
        int ans =floorNo(arr , target);
        System.out.println(ans);
    }

    //return index of the smallest element >= target

    static int floorNo(int[] arr , int target){
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
        return end;
    }
}