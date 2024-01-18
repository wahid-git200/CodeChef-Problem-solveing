

 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/MELTGOLD?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		while(t-- > 0){
		    
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    
		    int co = 1;
		    
		    while(y<x){
		        y+=co;
		         co++;
		    }
		    System.out.println(co-1);
		}
	}
}