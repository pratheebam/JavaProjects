import java.util.*;
public class Leaf
{
public static void main(String args[])
{
int i;
Scanner s=new Scanner(System.in);
int leafcount=s.nextInt();
int arr1[]=new int[leafcount];
for(i=0;i<=leafcount-1;i++)
arr1[i]=i+1;

int cater=s.nextInt();
int arr2[]=new int[cater];
for(i=0;i<=cater-1;i++)
arr2[i]=s.nextInt();


for(i=0;i<=arr1.length-1;i++){
for(int j=0;j<=arr2.length-1;j++){
if(arr1[i]%arr2[j]==0)
arr1[i]=0;
}
}
for(int k=0;k<arr1.length-1;k++)
{
if(arr1[k]!=0)
System.out.println(arr1[k]);
}
}
}
