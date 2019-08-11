import java .util.*;
public class Replace
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
String str1=s.nextLine();

String str2=s.nextLine();
char[] ch=str1.toCharArray();
for(int i=0;i<ch.length;i++)
{
str2=str2.replaceAll(Character.toString(str1.charAt(i)),"");
}
System.out.println(str2);
}
}