import java.util.*;
public class Max
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
int  num=sc.nextInt();
int hou=0,money=0;
for(int i=0;i<num;i++)
{

hou=sc.nextInt();
money=sc.nextInt();
}
int sum=0;
for(int i=0;i<num;i++)
{
for(int j=0;j<hou;j=j+2)
{

sum=sum+money;

}
System.out.println(sum);
}
}
}

