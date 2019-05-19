iimport java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = Integer.parseInt(s[i]);
            boolean flag = true;
            int count = 1;
            for(int i=0, j=n-1; i<=j; i++, j--) {
                if(arr[i] != arr[j] || !(arr[i] == count || arr[i] == count+1)) {
                    flag = false;
                    break;
                }
                count = arr[i];
            }
            
            
            System.out.println(flag && count == 7? "yes" : "no");
        }
	}
}