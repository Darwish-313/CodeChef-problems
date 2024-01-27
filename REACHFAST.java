
Difficulty:777
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
            int k=input.nextInt();
            int c=0;
            int g=Math.max(a,b);
            int h=Math.min(a,b);
            int u=g-h;
            if(u>=0){
                while(u>0){
                    u-=k;
                    c++;
                }
                System.out.println(c);
            }else{
                System.out.println(0);
            }
        }
	}
}
