package Arrays2;
import java.util.Arrays;
public class traping_water {

	public static void main(String[] args) {
		//? Date: 14-4-2023
		//* Description: Trapping of rain water

		//! https://leetcode.com/problems/trapping-rain-water/description/

		// trapping rain water
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int n = arr.length;

		int[] water = new int[n];   // water array

		// left array
		int[] left = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
		   max = Math.max(arr[i], max);    // max = max(arr[i], max)
		   left[i] = max;
		        }

		// right array
		int[] right = new int[n];
		max = 0;
		for (int i = n - 1; i >= 0; i--) {
		    max = Math.max(arr[i], max);    // max = max(arr[i], max)
		    right[i] = max;
		        }

		// loop for water calculation
		for (int i = 0; i < n; i++) {
		    water[i] = Math.min(left[i], right[i]) - arr[i];    // water[i] = min(left[i], right[i]) - arr[i]
		        }

		// sum of water
		int sum = 0;    
		for (int i = 0; i < n; i++) {
		    sum += water[i];
		        }
		   System.out.println(Arrays.toString(water));
		   System.out.println(sum);

		    }
		

	}


