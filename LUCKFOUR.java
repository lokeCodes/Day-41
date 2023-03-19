// https://www.codechef.com/problems/LUCKFOUR
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
	        int count = 0;
	        while(x>0){
	            int rem = x%10;
	            if(rem==4){
	                count++;
	            }
	            
	            x = x/10;
	        }
	        System.out.println(count);
	    }
    }
}


