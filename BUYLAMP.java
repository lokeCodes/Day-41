// https://www.codechef.com/problems/BUYLAMP
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int r = s.nextInt();
		    int cr = s.nextInt();
		    int cy = s.nextInt();
		    int res1 = r*cr;
		    int res2 = (n-r)*(Math.min(cr,cy));
		    int res = res1+res2;
		    System.out.println(res);
		}
	}
}
