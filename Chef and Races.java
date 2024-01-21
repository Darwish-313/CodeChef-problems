//Chef and Races
//Difficulty Rating:745
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
            int a=input.nextInt();
            int b=input.nextInt();
            int c=2;
            if(x==a || x==b){
                c--;
            } if(y==a || y==b){
                c--;
            }
            System.out.println(c);
        }
	}
}
