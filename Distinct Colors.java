Distinct Colors
Difficulty Rating:760

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
            int [] arr=new int[n];
            int m=arr[0];

            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }

            for(int j=0;j<n;j++){
                if(m<arr[j])
                m=arr[j];
                
            }
            System.out.println(m);
        }
	}
}
