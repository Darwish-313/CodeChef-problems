import java.util.*;
import java.lang.*;
import java.io.*;

Self Defence Training
Difficulty Rating:716

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int [] arr=new int[n];
            int c=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=input.nextInt();
                if(arr[i]>=10 && arr[i]<=60)
                c++;
                
            }
            System.out.println(c);
        }
        
	}
}
