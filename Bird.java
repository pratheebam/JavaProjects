import java.util.Scanner;

public class Bird
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int n,i,j;
		n = in.nextInt();
		//n = 11;
		
		int[] birds = new int[n];
		//int[] birds = {1,2,3,4,5,4,3,2,1,3,4};
		
		int presCount = 0, prevCount = 0;
		
		int highFreqBird=-1;
		
		for(i=0;i<n;i++)
			birds[i] = in.nextInt();
		
		for(i=0;i<n-1;i++)
		{
			presCount = 0;
			
			if(birds[i] == -1)
				continue;
			
			for(j=i+1;j<n;j++)
			{
				if(birds[j] == -1)
					continue;
				
				if(birds[i] == birds[j])
				{
					++presCount;
					birds[j] = -1;
				}
			}
			if(presCount > prevCount)
			{
				highFreqBird = birds[i];
			}
			else if(presCount == prevCount)
			{
				highFreqBird = birds[i] < highFreqBird? birds[i] : highFreqBird;
			}
			prevCount = presCount;
		}
		
		System.out.println("Bird with highest frequency is " + highFreqBird);
	}
}
  