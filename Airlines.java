Airlines
Difficulty Rating:712

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
            int x=input.nextInt();
            int y=input.nextInt();
            
            int c=0;
            while(y>0){
                y-=100;
                c++;
            }
            if(x>=c){
                System.out.println(0);
            }else{
            int d=Math.max(c,x);
            int f=Math.min(c,x);
            int g=d-f;
            System.out.println(g);
            }
        }
	}
}
