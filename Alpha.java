import java.util.*;
public class Alpha
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
String r="";
int n,m,num;
char[] ch=str.toCharArray();
for(int i=0;i<ch.length-2;i++) 
{
if(Character.isLetter(ch[i]))
{
if(i+2<ch.length&&Character.isDigit(ch[i+1])&&Character.isDigit(ch[i+2]))
{
n=Integer.parseInt(Character.toString(ch[i+1]));
m=Integer.parseInt(Character.toString(ch[i+2]));
num=n*10+m;
for(int k=0;k<num;k++)
{
r=r+ch[i];
}
}
else if(Character.isDigit(ch[i+1]))
{
n=Integer.parseInt(Character.toString(ch[i+1]));
for(int k=0;k<n;k++)
{
r=r+ch[i];
}
}
}
}
System.out.println(r);
}
}