//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String args[]){
        int[][] account = {
            {2,8,7},
            {7,1,3},
            {1,9,5} };
        System.out.println(maximumWealth2(account));
    }
    
    static int maximumWealth(int[][] account){
        // person = row
        // accounts = col
        int ans = Integer.MIN_VALUE;
        for(int person =0; person < account.length ; person++)
        {
            // when you start a new row, take a new sum for that row
            int sum=0;
            for(int accounts = 0; accounts < account[person].length; accounts++)
            {
               sum = sum + account[person][accounts];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

    static int maximumWealth2(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
