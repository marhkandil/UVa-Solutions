<<<<<<< HEAD
package cp2_2;
	
import java.io.*; 
import java.util.*;

public class Alaska{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		while((n=Integer.parseInt(br.readLine()))!=0)
		{
			int[] stations = new int[n];
			for(int i = 0; i < n; i++)
				stations[i] = Integer.parseInt(br.readLine());
			Arrays.sort(stations);
			int i;
			for(i = 0; i < n - 1; i++)
				if(stations[i+1]-stations[i]>200)
					break;
			if(i==n-1&&(1422-stations[i])*2<=200)
				sb.append("POSSIBLE\n");
			else
				sb.append("IMPOSSIBLE\n");
		}
		
		System.out.print(sb);
	
		
	}
	
	
=======
package cp2_2;
	
import java.io.*; 
import java.util.*;

public class Alaska{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		while((n=Integer.parseInt(br.readLine()))!=0)
		{
			int[] stations = new int[n];
			for(int i = 0; i < n; i++)
				stations[i] = Integer.parseInt(br.readLine());
			Arrays.sort(stations);
			int i;
			for(i = 0; i < n - 1; i++)
				if(stations[i+1]-stations[i]>200)
					break;
			if(i==n-1&&(1422-stations[i])*2<=200)
				sb.append("POSSIBLE\n");
			else
				sb.append("IMPOSSIBLE\n");
		}
		
		System.out.print(sb);
	
		
	}
	
	
>>>>>>> 39f869b7a0b14772c795150d9bb52127d820fece
}	