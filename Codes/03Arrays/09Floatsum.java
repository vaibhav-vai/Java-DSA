//Create an array of 5 float values and find their sum

public class Floatsum {
    public static void main(String[] args){
        float[] arr = {65.5f , 78.9f , 68.4f , 68.9f , 79.5f};
        float sum = 0;
        for (float element : arr){
            sum = element + sum;
        }
        System.out.println("The sum of array =" + sum);
    }

    
}
