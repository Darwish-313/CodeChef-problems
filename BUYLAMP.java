Buy Lamps
Difficulty:775

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            
            int r=k*x;
            int l=(n-k)*y;
            
            if(x<=y){
		    System.out.println(x*n);
		    }
		    else if(y<x){
		    System.out.println(r+l);
		    }
            
        }
	}
}
