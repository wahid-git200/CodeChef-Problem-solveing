

 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/EITA

import java.util.*;
import java.lang.*;
import java.io.*;

class Maximum_Production
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		 if(t>=1&&t<=Math.pow(10,3)*5)
		while(t-- > 0){
		    
		    int d = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    
		    if(d>=1&&d<7)
		    if(z>=1&&z<=18 && x>=1&&x<=18 && y>=1&&y<=18)
		    
		    x = x *7;
		    y = (y * d) + ((7-d) * z);
		    System.out.println(Math.max(x,y));
		}

	}
}
