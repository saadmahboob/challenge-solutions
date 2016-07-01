import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
/**
 * The Solution of Millionaire for MobiKwik Hiring Challenge
 * URL: http://www.hackerearth.com/mobikwik-hiring-challenge/algorithm/who-wants-to-be-a-millionaire-7/
 * @author Vijay
 *
 */
class Millionaire {

	public static void main(String[] args) {
		
		Millionaire millionaire = new Millionaire();
		try {
			DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMaximumFractionDigits(6);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int T = Integer.parseInt(line);
	        for (int iteration = 0; iteration < T; iteration++) {
	        	double N = Double.parseDouble(br.readLine());
	        	double prob = 1 - 1/N;
	        	//double prob = (N - 1)/N;
	        	//System.out.println(decimalFormat.format(prob));
	        	System.out.println(String.format("%.6f", prob));
	        }
		} catch (Exception e) {
			System.out.println("[-] Error in Parsing Input data: " + e.getLocalizedMessage() + " , Please provide correct input");
		}
        
        
		//System.out.println(doorNumber);
	}

}
