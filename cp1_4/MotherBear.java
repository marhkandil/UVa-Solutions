<<<<<<< HEAD
package cp1_4;
	
import java.io.*;
	
public class MotherBear{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			String sentence = br.readLine();
			if(sentence.equals("DONE"))
				break;
			String r = "";
			for(int i = 0; i < sentence.length(); i++)
			{
				switch(sentence.charAt(i))
				{
				case '.': case ' ': case ',': case '!': case '?': break;
				default: r += sentence.charAt(i);
				}
			}
			r = r.toUpperCase();
			if(isPalindrome(r))
				sb.append("You won't be eaten!\n");
			else
				sb.append("Uh oh..\n");
		}
		System.out.print(sb);
	}
	
	
	
	public static boolean isPalindrome(String s)
	{
		
		if(s.length()<=1)
			return true;
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		return isPalindrome(s.substring(1,s.length()-1));
	}

=======
package cp1_4;
	
import java.io.*;
	
public class MotherBear{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			String sentence = br.readLine();
			if(sentence.equals("DONE"))
				break;
			String r = "";
			for(int i = 0; i < sentence.length(); i++)
			{
				switch(sentence.charAt(i))
				{
				case '.': case ' ': case ',': case '!': case '?': break;
				default: r += sentence.charAt(i);
				}
			}
			r = r.toUpperCase();
			if(isPalindrome(r))
				sb.append("You won't be eaten!\n");
			else
				sb.append("Uh oh..\n");
		}
		System.out.print(sb);
	}
	
	
	
	public static boolean isPalindrome(String s)
	{
		
		if(s.length()<=1)
			return true;
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		return isPalindrome(s.substring(1,s.length()-1));
	}

>>>>>>> 39f869b7a0b14772c795150d9bb52127d820fece
}	