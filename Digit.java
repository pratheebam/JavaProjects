import java.util.*;
public class Digit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i%2==0)
{
System.out.print(ch[i]);
}
}
for(int j=0;j<ch.length;j++)
{
if(j%2!=0)
{
System.out.print(ch[j]);
}
}
}
}