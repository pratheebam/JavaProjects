import java.util.*;
public class Funny
{
public static void main(String[] args)
 {
int c=0;
int b=0,M=0;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
String a="";
for(int i=ch.length-1;i>=0;i--)
{
a=a+ch[i];
}
System.out.println(a);
for(int i=0;i<str.length()-1;i++)

{
b=Math.abs(str.charAt(i)-str.charAt(i+1));
M=Math.abs(a.charAt(i)-a.charAt(i+1));
}
if(b==M)
System.out.println("Funny");
else
System.out.println("Not Funny");
}
}
