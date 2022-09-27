import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> nums = new ArrayList<>(10);
        // nums.add(67);
        // nums.add(66);
        // nums.add(65);
        // nums.add(64);
        // nums.add(63);
        // nums.add(69);

        // System.out.println(nums);
        // nums.set(5,99);
        // System.out.println(nums);
        // nums.remove(2);
        // System.out.println(nums);

        //input
        for(int i=0;i<5;i++){
            nums.add(in.nextInt()); 
        }

        //output  get item at any index
        for(int i=0;i<5;i++){
            System.out.println(nums.get(i));  //pass index here list[index] syntax will not work here
        }
        System.out.println(nums.get(2));
    }
}
