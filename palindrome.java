package com.oece9.pack1;

import java.util.Scanner;

public class palindrome {
pumblic static void main(String[]args)
Scanner scn = new Scanner(System.in)
int num =scn.nextInt();
int rev = scn.nextInt();
int rem = "";
int integer = num;
for( num!=0;num/=0)
{
	rem= n%10;
	rev = rev*10+rem;
}
if (integer==rev)
	System.out.print("Integer is a palindrome");
else
	System.out.print("not a palindrome");
}
}
