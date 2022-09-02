import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Math.max is fuction which takes two number as argument and return the maximun of them

        int max = Math.max(c,Math.max(a,b));

        System.out.println("The largest Number is = " + max);
        
    }
}
