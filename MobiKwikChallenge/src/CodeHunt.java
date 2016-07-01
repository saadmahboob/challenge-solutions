import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * The Solution of CodeHunt for MobiKwik Hiring Challenge
 * URL: http://www.hackerearth.com/mobikwik-hiring-challenge/algorithm/code-hunt/
 * @author Vijay
 *
 */
class CodeHunt {

	public static void main(String[] args) {
		/*int arraySize = 3;
		int array[] = { 10, 2, 3 };

		CodeHunt codeHunt = new CodeHunt();
		int doorNumber = codeHunt.getDoorNumber(arraySize, array);*/
		CodeHunt codeHunt = new CodeHunt();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int T = Integer.parseInt(line);
	        for (int iteration = 0; iteration < T; iteration++) {
	        	int arraySize = Integer.parseInt(br.readLine());
	        	String arrayStr[] = br.readLine().split(" ");
	        	int array[] = new int[arraySize];
	        	for(int i=0; i < arraySize; i++) {
	        		array[i] = Integer.parseInt(arrayStr[i]);
	        	}
	        	System.out.println(codeHunt.getDoorNumber(arraySize, array));
	        }
		} catch (Exception e) {
			System.out.println("[-] Error in Parsing Input data: " + e.getLocalizedMessage() + " , Please provide correct input");
		}
        
        
		//System.out.println(doorNumber);
	}

	public int getDoorNumber(int arraySize, int a[]) {
		int doorNumber = 0;
		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (getGCD(a[i], a[j]) == a[j]) {
					int tempGCD = (int) getGCD(Math.pow(2, a[i])-1, Math.pow(2, a[j])-1);
					if (tempGCD == Math.pow(2, a[j])-1)
						doorNumber = doorNumber + 1;
					else
						doorNumber = doorNumber - tempGCD;
				}
			}
		}
		return doorNumber;
	}

	public double getGCD(double a, double b) {
		if (b == 0) {
			return a;
		}
		//return getGCD(b, a % b);
		 while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }
		return a;
	}

}
