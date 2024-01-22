Far from origin
Difficulty Rating:750

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
            int x1=input.nextInt();
            int y1=input.nextInt();
            int x2=input.nextInt();
            int y2=input.nextInt();
            
            double c=d(x1,y1);
            double d=d(x2,y2);
            if(c>d){
                System.out.println("ALEX");
            }else if(d>c){
                System.out.println("BOB");
            }else{
                System.out.println("EQUAL");
            }
            
        }
	}
	public static double d(int x, int y){
	    return Math.sqrt(x*x+y*y);
	}
}
