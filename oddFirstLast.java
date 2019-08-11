import java.util.*;
public class oddFirstLast
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(a=a+1;a<b;a++)
{
if(a%2==0)
{
String st=""+a;
if(st.charAt(0)==st.charAt(st.length()-1))
System.out.println(a+" ");
}
}
}
} 