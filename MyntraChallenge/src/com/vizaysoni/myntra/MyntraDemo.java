package com.vizaysoni.myntra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyntraDemo {

	static int[] sort(int[] d) {

		// int sorted = [];

		return d;
	}

	static int triplets(int t, int[] d) {

		Arrays.sort(d);

		int len = d.length;
		int count = 0;
		for (int i = 0; i < len - 2; i++) {

			System.out.println("ss : " + i);

			int sum = d[i] + d[i + 1] + d[i + 2];
			if (sum <= t) {
				count++;
			} else {
				break;
			}
		}

		System.out.println("count : " + count);

		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = "out.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _t;
		_t = Integer.parseInt(in.nextLine());

		int _d_size = Integer.parseInt(in.nextLine());
		int[] _d = new int[_d_size];
		int _d_item;
		for (int _d_i = 0; _d_i < _d_size; _d_i++) {
			_d_item = Integer.parseInt(in.nextLine());
			_d[_d_i] = _d_item;
		}

		res = tripletsNew(_t, _d);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}

	static int tripletsNew(int t, int[] d) {
		int len = d.length;
		int count = 0;
		for (int i = 0; i < len; i++) {

			for (int j = 0; j < len; j++) {

				if (i != j && d[i] < d[j]) {

					for (int k = 0; k < len; k++) {

						if (j != k && k != i && d[j] < d[k]) {
							// checking sum
							if (d[i] + d[j] + d[k] <= t) {
								count++;
							}

						} // if

					} // k loop

				} // i, j if cond.

			} // j loop

		} // i loop

		System.out.println("count : " + count);
		return count;
	}

	static int tripletsViz(int t, int[] d) {
		int len = d.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < len; k++) {
					if (i != j && j != k && k != i && d[i] < d[j]
							&& d[j] < d[k]) {

						int sum = d[i] + d[j] + d[k];
						if (sum <= t) {
							count++;
						}

					} // if
				} // k loop
			} // j loop
		} // i loop

		// System.out.println("count : " + count);
		return count;
	}
}
