public class LinearSearch{
    public static void main(String [] args){
        int[] nums = {1,89,68,79,-9,658,-7,39,-8,-1,7};
        int target = 658;

        //for index
        int answerindex = Search(nums , target);
        System.out.println(answerindex);

        //for element
        int answerelement = Search2(nums , target);
        System.out.println(answerelement);

        //for true or false
        boolean answerboolean = Search3(nums , target);
        System.out.println(answerboolean);
    }

    // search the element in the array if found return the index
    // if element is not present then return -1
    static int Search(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        // run loop

        for(int index=0 ; index < arr.length ; index++){
            // check for every element if it is present or not
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this will be executed if the element is not found in  the array which means the target is not found

        return -1;

    }


    // search the element in the array if found return the element
    // if element is not present then return -1
    static int Search2(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        // run loop

        for(int index=0 ; index < arr.length ; index++){
            // check for every element if it is present or not
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        // this will be executed if the element is not found in  the array which means the target is not found

        return -1;

    }

    // search the element in the array if found return true
    // if element is not present then return false

    static boolean Search3(int[] arr , int target){
        if (arr.length == 0){
            return false;
        }

        // run loop

        for(int index=0 ; index < arr.length ; index++){
            // check for every element if it is present or not
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        // this will be executed if the element is not found in  the array which means the target is not found

        return false;

    }

    

}
