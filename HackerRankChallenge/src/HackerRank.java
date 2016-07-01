public class HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String getXNumber(int n) {
		int i;
		String my = "";

		if (n < 10) {
			return n + "";
		}

		for (i = 9; i > 1; i--) {
			while (n % i == 0) {
				n = n / i;
				my = i + my;
			}
		}

		if (n > 10) {
			return -1 + "";
		}
		return my;

	}

}
