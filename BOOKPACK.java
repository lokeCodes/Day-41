// https://www.codechef.com/problems/BOOKPACK
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
		    double y = s.nextInt();
		    double z = s.nextInt();
            int rem = (int)Math.ceil(y/z);
            if(z>=y){
                System.out.println(x);
            }else{
                System.out.println(x*rem);
            }
		}
	}
}
