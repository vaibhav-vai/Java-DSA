import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // intial number
        int n = in.nextInt();   // the number whose occurances is to be displayed
        int occ = 0;
        int rem = 0;

        while (num > 0){
           rem = num % 10;
           if(rem == n){
            occ ++;
           }
           num = num / 10;
        }
        System.out.println("Answer =" + occ);

    }
    
}
