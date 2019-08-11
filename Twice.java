import java.util.*;
public class Twice
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int c=0,k=0;
String str[]=new String[num];
for(int i=0;i<num;i++)
{
str[i]=sc.next();
}
for(int i=0;i<num;i++)
{
c=0;
if(!str[i].equals(" "))
{
for(int j=i+1;j<num;j++)
{
if(str[i].equals(str[j]))
{
c++;
str[j]=" ";
}
}
}
str[i]=" ";
if(c==1)
{
k=k+1;
}
}
System.out.println(k);
}
}
