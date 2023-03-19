// https://www.codechef.com/problems/T20MCH
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int o = s.nextInt();
		int c = s.nextInt();
		int ro = 20-o;
		int max = ro*36;
		int cteam_score = c+max;
		String res = cteam_score>r ? "Yes" : "No";
		System.out.println(res);
	}
}
