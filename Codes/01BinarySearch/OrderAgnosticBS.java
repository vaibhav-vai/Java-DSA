public class OrderAgnosticBS {
    public static void main(String args[]){
        //int[] arr = {-99,-86,-8,-3,0,2,6,7,9,15,20,65,78,96,99};
        int[] arr = {99,87,78,69,50,40,12,9,3,0,-6,-45,-77,-99};
        int target=78;
        int ans =orderagnosticBS(arr , target);
        System.out.println(ans);
    }

    //return index
    //return -1 if target doesn't exist in array
    static int orderagnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
         
        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            // find the middle 
           // int mid = (start + end) / 2;   might be possible that (start + end) exceeds the range of int in java
            int mid = start +(end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
    
}
