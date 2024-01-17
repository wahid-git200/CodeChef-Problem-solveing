 // link of tis broblem pist this on your browser
//https://www.codechef.com/problems/BULLET


import java.util.*;
import java.lang.*;
import java.io.*;

class Mario_and_Bullet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		    
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    
		    int result = y / x;
		    
		    if(result > z)
		      System.out.println(0);
		    else
		      System.out.println(z - ( y / x ));
		}

	}
}
