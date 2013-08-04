
import java.util.*;

class zA
{
	public static void main(String[] args)
	{
		int num , len = 0, i, j, count = 0, r1 ,r2;
		LinkedList list = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		r1 = sc.nextInt();
		r2 = sc.nextInt();
		
		int temp = r1;
		
		while(temp != 0)
		{
			len++;
			temp = temp / 10;
		}
		System.out.println("Length Is : " + len);
		
		while(r1 < r2)
		{
			num = r1;
			
			for(i=1; i<len; i++)
			{
				temp = num % (int)Math.pow(10,i);
				
				temp = temp * (int)Math.pow(10,len-i) + num / (int)Math.pow(10,i);
				
				
				if( temp >= r1 && temp <=r2)
				{
					int temp1 = temp;
					
					temp1 = temp % 10;
					
					int f = temp1;
					/*
					for(j=1; j<len; j++)
					{
						if(temp1 != (temp % Math.pow(10,j+1)) / Math.pow(10,j) )
						{
							break;
						}
					}
					temp1 = temp1++;
					
					if(temp == temp1)
					{
						System.out.println("NO " + temp);
						break;
					}
					*/
					
					
							list.add(temp);
							count++;
							System.out.println("Added : Pair " + num + "  " + temp);
				
					
				}
			}
			
			r1++;
		}
		
		System.out.println("Count : " + count);
		
	}
}