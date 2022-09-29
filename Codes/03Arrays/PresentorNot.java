//Write a program to find whether a given integer is present or not in an array

public class PresentorNot {
    public static void main(String [] args){
        int[] arr ={1,88,97,36,77,97,59};
        int num = 77;
        boolean isInArray = false;
        for (int element:arr){
            if (element == num){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The integer "+ num + " is present in array");
        }
        else{
            System.out.println("The integer " + num +" is NOT present in array");
        } 

    }
    
}
