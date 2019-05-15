import java.util.*;
public class Main
{
	static void sieve(boolean [] arr, int r)
	{
		for(int i=2; i<(int)Math.sqrt(r); i++)
		{
			int j=2;
			while(j*i<r+1)
			{
				arr[j*i]=false;
				j++;
			}
		}
	}
	public static void main(String [] at)
	{
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		sc.close();
		boolean arr[]= new boolean[r+1];
		Arrays.fill(arr, true);
		arr[0]=false;
		arr[1]=false;
		sieve(arr, r);
		for(int i=0; i<r+1; i++)
			if(arr[i]==true)
				System.out.print(i+" ");
	}
}