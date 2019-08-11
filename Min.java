import java.util.*;
public class Min
{
public static void main(String args[])
{

Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
int num=scan.nextInt();
int arr1[]=new int[num];
int arr2[]=new int[num];
int temp=0;
for(int i=0;i<num;i++)
{
arr1[i]=scan.nextInt();
}
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(arr1[i]<arr1[j])
{
temp=arr1[i];
arr1[i]=arr1[j];
arr1[j]=temp;
}
}
}
for(int i=0;i<num-1;i++)
{
arr2[i]=arr1[i]-arr1[i+1];
}
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num-1;j++)
{
if(arr2[i]>arr2[j])
{
temp=arr2[i];
arr2[i]=arr2[j];
arr2[j]=temp;
}
}
}
System.out.println(arr2[0]);
}
}
