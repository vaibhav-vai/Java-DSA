import java.util.Arrays;
public class SearchInString {
    public static void main(String args[]){
        String name = "Vaibhav";
        char element = 'h';
        boolean ans = Search2(name , element);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);
    }

    static boolean Search2(String naam , char target){
        if(naam.length() == 0){
            return false;
        }
        for(char letter : naam.toCharArray()){
            if( letter == target){
                return true;
            }
        }
        return false;
    }

    static boolean Search(String naam , char target){
        if(naam.length() ==0){
            return false;
        }
        for(int i=0; i<naam.length(); i++){
            if(target == naam.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}
