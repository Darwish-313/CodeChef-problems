import java.util.*;
import java.lang.*;
import java.io.*;

Cup Finals
Difficulty Rating:716

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
            int d=input.nextInt();
            int c=Math.max(x,y);
            int g=Math.min(x,y);
            int f=c-g;
            if(f<=d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
