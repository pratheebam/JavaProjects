import java.util.*;
public class countSetBits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int c=0;
for(int j=1;j<=num;j++)
{
int t=j;
while(t>0)
{
if(t%2==1)
c++;
t=t/2;  
}
}
System.out.println(c);
}
}

