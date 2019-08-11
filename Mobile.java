import java.util.*;
public class Mobile
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C')
System.out.print(2);
if(str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F')
System.out.print(3);
 if(str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I')
System.out.print(4);
if(str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L')
System.out.print(5);
if(str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O')
System.out.print(6);
if(str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S')
System.out.print(7);
if(str.charAt(i)=='T'||str.charAt(i)=='U'||str.charAt(i)=='V')
System.out.print(8);
if(str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z')
System.out.print(9);
}
}
}