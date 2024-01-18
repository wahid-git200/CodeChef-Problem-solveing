

 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/LOOP

import java.util.*;
import java.lang.*;
import java.io.*;

class Circular_Track
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		     
		    int l = Math.abs(b - a);
		    int d = Math.abs(c - l);
		    System.out.println( Math.min( l , d ) );
		}
	}
}