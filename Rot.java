import java.util.*;
public class Rot
{
public static void main(String arg[])
{
int temp;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rotate=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<rotate;i++)
{
temp=arr[0];

for(int j=0;j<arr.length-1;j++)
{
arr[j]=arr[j+1];
}
arr[arr.length-1]=temp;
}
for(int k=0;k<num;k++)
{
System.out.println(arr[k]);
}
}
}
 
