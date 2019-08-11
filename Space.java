import java.util.*;
public class Space
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(); 
char ch[]=s.toCharArray();
int a=ch.length-1;
for(int i=a;i>=0;i--)
{
if(ch[i]!=' ')
{
ch[a--]=ch[i];
}}
while(a>=0)
ch[a--]=' ';
System.out.println(ch);
}
}
