import java.util.*;
public class Mobile
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
if(ch[i]==1)
System.out.print("A"+"B"+"C");
if(ch[i]==2)
System.out.print("D"+"E"+"F");
if(ch[i]==3)
 System.out.print("G"+"H"+"I");
if(ch[i]==4)
System.out.print("J"+"K"+"L");
if(ch[i]==5)
System.out.print("M"+"N"+"O");
if(ch[i]==6)
System.out.print("P"+"Q"+"R");
if(ch[i]==7)
System.out.print("S"+"T"+"U");
if(ch[i]==8)
System.out.print("V"+"W"+"X");
if(ch[i]==9)
System.out.print("Y"+"Z");
}
}
}