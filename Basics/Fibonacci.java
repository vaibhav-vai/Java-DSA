/* Fibonacci series is a number series in which each number is the sum of the two preceding numbers.
EX - 0,1,1,2,3,5,8,13,.... */

import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a=0;
        int b=1;
        int count = 2;
        System.out.print(a);
        System.out.print(" "+b);
        while(num > count){
            int temp = b;
            b +=a;
            a = temp;
            count++;
            
            System.out.print(" "+b);
        }
        

    }
}