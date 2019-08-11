import java.util.*;
public class Paranthesis
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=str.length();
Stack<Integer>stk=new Stack<Integer>();
stk.push(-1);
int result=0;
for(int i=0;i<n;i++)
{
if(str.charAt(i)=='(')
stk.push(i);
else
{
stk.pop();
if(!stk.empty())
result=Math.max(result,i-stk.peek());
else stk.push(i);
}
}
System.out.println(result);
}
}
