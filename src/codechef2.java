import java.util.Arrays;
import java.util.Scanner;

public class codechef2 {

	public static void main(String[] args) {
		int arr[]= {2,4,6};
		int totalScore=100;
		
		System.out.println(find(arr, totalScore));

	}
	
	public static int find(int []coins,int sum){
       
		int memo[]=new int[sum+1];
		Arrays.fill(memo, 0);
		memo[0]=1;
		memo[2]=1;
		for (int i = 4; i <= sum; i+=2) {
			for(int coin:coins) {
				if(i-coin>=0) {
					memo[i]+=memo[i-coin];
				}
			}
		}
		
		return memo[sum];
		
        
    }

}
