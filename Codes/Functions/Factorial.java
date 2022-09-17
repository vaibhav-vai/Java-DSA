import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printFactorial(n);
    }

public static void printFactorial(int n){
    int factorial = 1;
    if (n<0){
        System.out.println("Invalid Number");
        return;
    }
    //loop
    for (int i=n; i>=1 ; i--){
        factorial = factorial *i;
    }
    System.out.println(factorial);
    return;

    }
}