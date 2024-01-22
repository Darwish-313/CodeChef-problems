Endless Appetizers
Difficulty Rating:752

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
            int r=input.nextInt();
            
            int c=0;
            while(r>0){
                 r-=30;
                c++;
            }
            x+=c;
            int f=0;
            while(x>0){
                x-=y;
                f++;
            }
            System.out.println(f);
        }
	}
}
