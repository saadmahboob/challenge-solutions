/**
 * Author: Vijay Soni(vs4vijay@gmail.com)
 * Question: K Diff.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KnowlarityDemo {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		int arr[] = { 1, 5, 3, 4, 2 };
		int k = 3;
		// System.out.println(calculateDifference(arr, k));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String arrayStr[] = line.split(" ");
		int N = Integer.parseInt(arrayStr[0]);
		int K = Integer.parseInt(arrayStr[1]);

		line = br.readLine();
		arrayStr = line.split(" ");

		arr = new int[N];
		int val;
		for (int i = 0; i < N; i++) {
			val = Integer.parseInt(arrayStr[i]);
			arr[i] = val;
		}

		System.out.println(calculateDifference(arr, K));
	}

	static int calculateDifference(int arr[], int k) {
		int count = 0;
		int n = arr.length;
		Arrays.sort(arr);

		int l = 0;
		int r = 0;
		while (r < n) {
			if (arr[r] - arr[l] == k) {
				count++;
				l++;
				r++;
			} else if (arr[r] - arr[l] > k) {
				l++;
			} else {
				r++;
			}
		}
		return count;
	}
}