import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" :
            System.out.println("King of Fruits");
            break;

            case "Orange" :
            System.out.println("Round Fruit");
            break;

            case "Apple" :
            System.out.println("A sweet red fruit");
            break;

            case "Grapes" :
            System.out.println("small fruit");
            break;

            default :
            System.out.println("Please enter a valid statement");


        }
    
    
    
    }
    
}
