

 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/PHONEYR
import java.util.*;
import java.lang.*;
import java.io.*;

class Yearly_Phone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		String str1 = String.valueOf(x);
		String str2 = "k" + str1.charAt(2) + str1.charAt(3);
		
		System.out.println(str2);

	}
}