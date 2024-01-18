

 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/GOODWEAT

import java.util.*;
import java.lang.*;
import java.io.*;

class Good_Weather
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		 int t=scan.nextInt();
		 
		 while(t-- > 0){
		     int runny = 0;
		     int sunny = 0;
		     
		     for(int i = 0 ; i < 7 ; i++){
		         
		         int x = scan.nextInt();
		         
		         if(x == 1)
		           sunny++;
		         else
		           runny++;
		     }
		     if(sunny > runny)
		       System.out.println("YES");
		     else
		       System.out.println("NO");
		 }

	}
}


