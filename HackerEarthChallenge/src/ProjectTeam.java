import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ProjectTeam {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine());
		for (int j = 0; j < t; j++) {
			String nStr = bf.readLine();
			String students[] = nStr.split(" ");
			int n = Integer.parseInt(students[0]);

			int[] no = convert(students);
			Arrays.sort(no);

			// int students[] = {2,6,4,3};
			// int n = 4;
			// Arrays.sort(students);

			int large = 0;
			int min = 0;

			for (int i = 0; i < n / 2; i++) {

				int first = no[i];
				int last = no[n - 1 - i];

				if (i % 2 == 0) {
					large = first + last;
				} else {
					min = first + last;
				}
			}
			// 
			// System.out.println("large : " + large);
			// System.out.println("min : " + min);
			System.out.println(Math.abs(large - min));
		}

	}

	public static int[] convert(String[] s) {
		int[] out = new int[s.length];
		for (int i = 0; i < out.length; i++) {
			out[i] = Integer.parseInt(s[i]);
		}
		return out;
	}

}
