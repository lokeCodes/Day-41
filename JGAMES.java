// https://www.codechef.com/problems/JGAMES
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int total = x+y;
		    String res = (total%2==0) ? "Janmansh" : "Jay";
		    System.out.println(res);
		}
	}
}
