public class SortedArray {
    public static void main(String[] args){
        int[] arr = {1,2100,654,98,36,5};
        boolean isSorted = true;
        for(int i = 0; i <arr.length-1 ; i++){
            if(arr[i] < arr[i+1]){
                isSorted = false;
                break;
            }

        }

        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is NOT sorted");
        }
    }
    
}
