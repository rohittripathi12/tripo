//Write a java program to find sum of even and product of odd digits

import java.util.Scanner;
class Sum_odd{
public static void main(String args[])
{
int n,sum=0,prod=1,digits;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number=");
n=sc.nextInt();
while(n>0){
digits=n%10;
if(digits%2==0){
sum=sum+digits;
}
else{
prod=prod*digits;
}
n=n/10;
}
System.out.println(sum);
System.out.println(prod);
}
}