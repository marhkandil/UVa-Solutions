<<<<<<< HEAD
package cp1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HorrorDash{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			for(int j = 1; j < n; j++)
			{
				int cur = Integer.parseInt(st.nextToken());
				if(cur>min)
					min = cur;
			}
			sb.append("Case "+i+": "+min+"\n");
		}
		System.out.print(sb);
		
	}
}
=======
package cp1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HorrorDash{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			for(int j = 1; j < n; j++)
			{
				int cur = Integer.parseInt(st.nextToken());
				if(cur>min)
					min = cur;
			}
			sb.append("Case "+i+": "+min+"\n");
		}
		System.out.print(sb);
		
	}
}
>>>>>>> 39f869b7a0b14772c795150d9bb52127d820fece
