/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num,rev=0,rem,org=0;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	org=num;
	while(num!=0)
	{
		rem=num % 10;
		rev=rev*10+rem;
		num /=10;
	}
	if(org==rev)
	System.out.println(org + "yes if it is palindrome");
	else
	System.out.println(rev +"no it is not");
	
	}
	}
