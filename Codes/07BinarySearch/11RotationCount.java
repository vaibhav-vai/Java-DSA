//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String args[]){
        int[] arr = {6,7,8,9,1,3,5};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }

    //Use this when duplicate elements are not present
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            //4 cases 
            if(arr[mid] > arr[mid+1] && mid < end){
                return mid;
            }
            if(arr[mid] < arr[mid-1] && mid > start){
                return mid-1;
            }
            if(arr[mid] < arr[start]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    // Use this when the array have duplicate elements
    static int findPivotwithduplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            //4 cases 
            if(arr[mid] > arr[mid+1] && mid < end){
                return mid;
            }
            if(arr[mid] < arr[mid-1] && mid > start){
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if( arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(start < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if(start < end && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

             // left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start =mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
