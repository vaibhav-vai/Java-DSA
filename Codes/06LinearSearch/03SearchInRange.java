public class SearchInRange {
    public static void main(String args[]){
        int[] num={1,2,18,35,987,6,5,7};
        int target=98;
        int start=1;
        int end = 6;
        int ans = linearSearch(num,target,start,end);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start; index <end; index++ ){
            int element = arr[index];
            if(target == element){
                return index;
            }
        }

        return -1;

    }
    }
