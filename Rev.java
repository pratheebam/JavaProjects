import java.util.*;
public class Rev
{
public static void main(String args[])
{
int c=1;
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String  res=" ";
char temp=str.charAt(0);
   for(int i=1;i<str.length();i++)
        {
         if(str.charAt(i)==temp)
         {
	c++;
          }
          else
          {
res+=temp+""+c;
temp=str.charAt(i);
c=1;
}
}
res+=temp+""+c;
System.out.println(res);
}
}