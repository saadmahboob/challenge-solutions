import java.util.Vector;

public class Solution {
	public static void main(String args[]) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };

		int[][] a = { { 1, 1, 0, 0 }, { 1, 1, 1, 0 } };
		maxOnes(a, a.length);

		int nums[] = { -5, -3, 1, 2, 4 };

		System.out.println(sort(nums));
	}

	/**
	 * * Prints all pair of integer values from given array whose sum is is
	 * equal to given number. * complexity of this solution is O(n^2)
	 */
	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	static int isSumPossible(Vector<Integer> a, int N) {
		for (int i = 0; i < a.size(); i++) {
			int first = a.get(i);
			for (int j = i + 1; j < a.size(); j++) {
				int second = a.get(j);
				if ((first + second) == N) {
					return 1;
				}
			}
		}
		return 0;
	}

	static int isIntegerPalindrome(int a) {
		int temp = a, carry;
		while (a > 0) {
			carry = a % 10;
			a = a / 10;
			a = a * 10 + carry;
		}
		if (temp == a) {
			return 1;
		} else {
			return 0;
		}
	}

	int isPalindrome(int x) {
		if (x < 0)
			return 0;
		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}
		while (x != 0) {
			int l = x / div;
			int r = x % 10;
			if (l != r)
				return 0;
			x = (x % div) / 10;
			div /= 100;
		}
		return 1;
	}

	static int maxOnes(int[][] a, int N) {
		int max[] = new int[N];
		for (int i = 0; i < N; i++) {
			max[i] = 0;
		}

		for (int i = 0; i < N; i++) {
			int arr[] = a[i];
			for (int value : arr) {
				if (value == 1) {
					max[i] = max[i] + 1;
				} else {
					break;
				}
			}
		}

		int m = 0, i = 0;
		for (int c : max) {
			i++;
			if (c > m) {
				m = c;
			}
		}
		return i;
	}

	static int[] sort(int arr[]) {
		// {-5, -3, 1, 2, 4};
		final int len = arr.length;
		int i = 0, j = len - 1, temp;

		while (j > i) {

			int first = Math.abs(arr[i]);
			int last = Math.abs(arr[j]);

			if (first > last) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j--;

		}

		for (int a : arr) {
			System.out.print(a + ", ");
		}
		return arr;
	}

}