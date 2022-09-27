import java.util.Arrays;
import java.util.Scanner;
public class ArrayInput{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        // array of primitive datatypes
        int[] arr = new int[5];

        //input using for loop
        for(int i=0; i < arr.length; i++ ){
            arr[i] = in.nextInt();
        }

        // printing using for loop 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // printing using for each loop
        for(int num : arr) {           // for every element in array, print the element
            System.out.print(num+" "); // here num represent element of the array
        }

        // printing using Array
        System.out.print(Arrays.toString(arr));

        // array of Objects
        String[] str = new String[4];

        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modifying String
        str[1] = "Messi";
        System.out.print(Arrays.toString(str));

    }
}