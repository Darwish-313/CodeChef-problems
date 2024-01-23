Dracula Eats
Difficulty Rating:763

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
            int c=0;
            while(n>=2){
                n-=7;
                c++;
            }
            System.out.println(c);
            
        }
	}
}
