import java.util.*;
public class printOddoccurence
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
String str1="";

for(int i=0;i<ch.length;i++)
{
count=0;
String a="";
for(int j=0;j<ch.length;j++)
{
if(ch[i]==ch[j])
{
count++;
}
}
//System.out.print(count);
a=a+ch[i];
if(!str1.contains(a)&&count%2!=0)
str1=str1+ch[i];
}
System.out.println(str1);
}
}

