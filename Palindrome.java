import java.util.*;
public class Palindrome{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int flag=0,c=0;
String res="";
for(int i=0;i<a.length();i++)
{
c=1;
for(int j=i+1;j<a.length();j++) 
{
if(a.charAt(i)==a.charAt(j))
{
c++;
}
}
if(!res.contains(Character.toString(a.charAt(i)))) {
res=res+a.charAt(i);
if((c%2)!=0)
flag++;
}
}
if(flag>1)
System.out.println("No");
else
System.out.println("Yes");
}
}