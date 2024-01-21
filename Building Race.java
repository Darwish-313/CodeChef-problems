Building Race
Difficulty Rating739
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
            int x=input.nextInt();
            int y=input.nextInt();
            
            double chef=(double) a/x;
            double Chefina=(double)b/y;
            if(chef==Chefina){
                System.out.println("Both");
            }else if(chef>Chefina){
                System.out.println("Chefina");
            }else{
                System.out.println("Chef");
            }
        }
	}
}
