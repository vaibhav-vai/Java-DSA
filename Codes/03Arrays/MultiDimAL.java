import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimAL {
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }

}