package task;

import java.util.Arrays;

public class MaximumGifts {
	
	public static int maximumGifts(int[][] gifts) {
		//Sort the list of gifts in ascending order based on their prices
		Arrays.sort(gifts, (a,b)->Integer.compare(a[1], b[1]));
		
		int totalGifts=0;
		int bankBalance=0;
		
		//iterate through the sorted list of gifts
		for(int[] gift : gifts) {
			int price=gift[1];
			
			//check if the price of the gift is affordable
			if(price <=bankBalance + 1) {
				bankBalance -=price;
				totalGifts ++;
			}
		}
		return totalGifts;
	}
	
	public static void main(String[] args) {
		int[][] gifts= {{1,3}, {2,3}, {3,2}, {4,1}, {5,3}};
		int gifts2 = maximumGifts(gifts);
		System.out.println(gifts2);
	}

}
