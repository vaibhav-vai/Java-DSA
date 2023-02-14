public class RBS {
    public static void main(String args[]){
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        int target = 1;
        System.out.println(search(arr , target));
    }
    
    static int search (int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot == -1){
            // There is no pivot that means It is not a rotated array we can simple find the answer by normal binary search
            BinarySearch(nums,target,0, nums.length - 1);
        }

        // if pivot is found , you have 2 asc arrays
        if (nums[pivot] == target){
            return pivot;
        }

        if(target > nums[0]){
            return BinarySearch(nums, target, 0, pivot-1);
        }

        return  BinarySearch(nums, target, pivot +1, nums.length-1);
    }

    static int BinarySearch(int[] nums, int target, int start , int end){
        while(start < end){
            int mid = start + (end-start)/ 2;

            if( nums[mid] < target){
                start = mid+1;
            }
            else if( nums[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // This will not work for duplicate values
    static int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            // 4 cases 
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    //If the arrays have duplicate we can use this method to find pivot
    static int findPivotwithduplicate(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            // 4 cases 
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            
            //If elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(start < end && arr[start] > arr[start+1] ){
                    return start;
                }
                start++;
                if(start < end && arr[end] < arr[end - 1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end] )){
                start= mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
