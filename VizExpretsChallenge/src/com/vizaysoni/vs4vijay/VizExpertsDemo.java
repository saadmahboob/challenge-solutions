package com.vizaysoni.vs4vijay;

import java.util.ArrayList;
import java.util.Scanner;

public class VizExpertsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("aa");

		Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(in.nextLine());

		// int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] val = getFib(n);
			for (int j : val) {
				System.out.print(j + " ");
			}
		}

		// int[] val = getFib(4);
		//
		// for(int i : val) {
		// System.out.println(i);
		// }
	}

	public static int[] getLargest(int n) {
		int[] arr = new int[n];

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(in.nextLine());
		int prev = t;
		for (;;) {
			prev = t;
			if ((t - prev) <= 0) {
				break;
			}
			t = Integer.parseInt(in.nextLine());
			list.add(t);
		}

		return arr;
	}

	// public static int[] maximumSubArrayAlgoLinear(int[] array, int start, int
	// n)
	// {
	// int runningSum;
	// int[] arr = new int[n];
	//
	// runningSum = 0;
	// //sol.Start = start;
	//
	// for (int i = start; i < n; i++)
	// {
	// runningSum += array[i];
	//
	// if (runningSum < 0)
	// {
	// runningSum = 0;
	// start = i + 1; // Start from next element
	// }
	// else if (runningSum > sol.Sum)
	// {
	// sol.Sum = runningSum;
	// sol.End = i;
	// }
	// }
	// return arr;
	// }

	public static int[] getFib(int n) {
		int[] arr = new int[n];
		if (n <= 1) {
			return arr;
		}
		int fibo = 1;
		int fiboPrev = 1;
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 2; i < n - 1; ++i) {
			int temp = fibo;
			fibo += fiboPrev;
			fiboPrev = temp;
			System.out.println(fibo);
			arr[i + 1] = fibo;
		}
		return arr;
	}

}
