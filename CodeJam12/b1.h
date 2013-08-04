#include<stdio.h>
#include<vector>
#include<math.h>
#include <algorithm>
#include <string>

using namespace std;

string str="$";

int main()
{
	int num , len = 0, i, j, count = 0, r1 ,r2;
	
	
	
	scanf("%d %d", &r1, &r2);
	
	int temp = r1;
	
	while(temp != 0)
	{
		len++;
		temp = temp / 10;
	}
	printf("Length Is : %d\n", len);
	
	while(r1 < r2)
	{
		num = r1;
		
		for(i=1; i<len; i++)
		{
			temp = num % (int)pow(10,i);
			
			temp = temp * pow(10,len-i) + num / pow(10,i);
			
			//printf("Temp Is : %d\n", temp);
			
			if( temp >= r1 && temp <=r2)
			{
				int temp1 = temp;
				temp1 = temp % 10;
				int f = temp1;
				for(j=1; j<len; j++)
				{
					temp1 = temp1 + f * pow(10,j); 
				}
				temp1 = temp1 ++;
				//printf("Temp : %d Temp1 : %d\n" , temp, temp1);
				
				if(temp == temp1)
				{
					printf("NO %d\n" , temp);
				}
				else
				{
					if(!str.find(temp))
					{
						str.append(temp);
						count++;
					}
					
				}
			}
		}
		
		r1++;
	}
	
	printf("Count : %d", count);
	
}
