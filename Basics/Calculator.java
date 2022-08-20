import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user press x or X
        
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op  == '*' || op == '-' || op == '/' || op == '%'){
                // take input from 2 number
                System.out.println("Enter the 1st number");
                int num1 = in.nextInt();
                System.out.println("Enter the 2nd number");
                int num2 = in.nextInt();

                if (op =='+'){
                    ans = num1 + num2;
                }

                if (op =='-'){
                    ans = num1 - num2;
                }

                if (op =='*'){
                    ans = num1 * num2;
                }

                if (op =='/'){
                    if (num2!=0){
                    ans = num1 + num2;
                    }
                }

                if (op =='%'){
                    ans = num1 % num2;
                }

            }
            else if ( op == 'x' || op == 'X'){
                break ;
            }
            else{
                System.out.println("Invalid operation !!!!");
            }
            System.out.println("Answer = "  + ans);
        }
    }
    
}
