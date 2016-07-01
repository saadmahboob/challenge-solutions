/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Medlife {

	static int sum = 0;

	// static int fact = 1;

	public static double getFactorial(double number) {

		if (number == 1) {
			return 1;
		} else if (number == 0) {
			return 0;
		} else {
			return number * getFactorial(number - 1);
		}

	}

	public static double getRSum(double number) {

		if (number == 0) {

			if (sum < 10) {
				return sum;
			} else {
				number = sum;
				sum = 0;
				return getRSum(number);
			}
		} else {
			sum += (number % 10);
			getRSum(number / 10);
		}

		return sum;
	}

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int j = 0; j < N; j++) {

			String arrayStr[] = br.readLine().split(" ");
			double a = Double.parseDouble(arrayStr[0]);
			double b = Double.parseDouble(arrayStr[1]);

			double rsumf = 0;
			double factA = 1;

			if (a != 0) {
				factA = getFactorial(a);
			}

			for (double i = a; i <= b; i++) {

				if (i == 0)
					continue;

				rsumf += getRSum(factA);
				System.out.println(i + "::" + rsumf);

				factA = factA * (i + 1);

				sum = 0;
				// fact = 1;
			}

			System.out.println(Math.round(rsumf));

		}
	}
}
