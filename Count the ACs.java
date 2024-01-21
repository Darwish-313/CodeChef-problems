Count the ACs
Difficulty Rating:739

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
            int p=input.nextInt();
            int c=0;
            int d=0;
            while(p>0){
                if(p>=100){
                p-=100;
                c++;
                }else{
                    p-=1;
                    c++;
                }
            }
            if(c>10){
                System.out.println(-1);
            }else{
                System.out.println(c);
            }
            
        }
	}
}
