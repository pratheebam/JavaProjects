import java.util.*;
public class Binary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int[] arr=new int[num];
for(int i=1;i<=num;i++)
{
int in=0;
int temp=i;
while(temp>0)
{
arr[in]=temp%2;
temp=temp/2;
in++;
}
for(int j=in-1;j>=0;j--)
{
System.out.print(arr[j]);
}
System.out.println();
}
}
}