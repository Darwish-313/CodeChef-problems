Cyclic Quadrilateral
Difficulty Rating:735


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
           int a=input.nextInt();
           int b=input.nextInt();
           int c=input.nextInt();
           int d=input.nextInt();
           
           if(a+c==180 && b+d==180){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
        }
	}
}
