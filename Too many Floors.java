import java.util.*;
import java.lang.*;
Too many Floors
Difficulty Rating:717


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
            
             int a = (x + 9) / 10;  
            int b = (y + 9) / 10; 
            
            int c = Math.abs(a - b); 
            
            System.out.println(c);
        }
	}
}
