import java.util.*;
public class countXInRange
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);	
System.out.println("Enter the range");
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("Enter the number");
int c=scan.nextInt();
for(int i=a+1;i<b;i++)
{
int s=i;
while(s!=0)
{
if(s%10==c)
count++;
s=s/10;

}
}
System.out.println(count);
}
}
