import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
/**
 * The Solution of Millionaire for MobiKwik Hiring Challenge
 * URL: http://www.hackerearth.com/mobikwik-hiring-challenge/algorithm/who-wants-to-be-a-millionaire-7/
 * @author Vijay
 *
 */
class ChangMathematicalBrainbuster {

	public static void main(String[] args) {
		
		ChangMathematicalBrainbuster cmb = new ChangMathematicalBrainbuster();
		try {
			DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMaximumFractionDigits(6);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int T = Integer.parseInt(line);
	        for (int iteration = 0; iteration < T; iteration++) {
	        	String arrayStr[] = br.readLine().split(" ");
	        	int array[] = new int[arrayStr.length];
	        	LinkedList<Integer> list = new LinkedList<Integer>();
	        	for(int i=0; i < arrayStr.length; i++) {
	        		//array[i] = Integer.parseInt(arrayStr[i]);
	        		list.add(Integer.parseInt(arrayStr[i]));
	        	}
	        	Collections.sort(list);
	        	
	        	//System.out.println("list : " + list);
	        	
	        	int count=0;
	        	int offset=0;
	        	int min=0;
	        	int max=0;
	        	while(true) {
	        		max = list.getLast();
	        		min = list.getFirst();
	        		offset = max - 3*min;
	        		
	        		if(offset <=0 ) {
	        			break;
	        		} else if(offset - 3*min > offset - max) {
	        			list.removeFirst();
	        			count++;
	        		} else {
	        			list.removeLast();
	        			count++;
	        		}
	        		
	        		/*if(isConditionTrue(list.getFirst(), list.getLast())) {
	        			break;
	        		} else {
	        			list.removeFirst();
	        			count++;
	        		}*/
	        	}
	        	
	        	
	        	
	        	System.out.println(count);
	        }
		} catch (Exception e) {
			System.out.println("[-] Error in Parsing Input data: " + e.getLocalizedMessage() + " , Please provide correct input");
		}
        
        
		//System.out.println(doorNumber);
	}
	
	public static boolean isConditionTrue(int min, int max) {
		if(max - 3*min <= 0) {
			return true;
		}
		return false;
	}
	
	public static int getOffsetValue(int min, int max) {
		return max - 3*min;
	}

}
