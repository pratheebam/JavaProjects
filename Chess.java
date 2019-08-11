import java.util.*;
public class Chess
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of knight");
int ki=sc.nextInt();
int king=sc.nextInt();		
String arr[][]=new String[8][8];
for(int i=0;i<ki;i++)
{
int row=sc.nextInt()-1;
int col=sc.nextInt()-1;



Markcell(arr,row+2,col-1,i);
Markcell(arr,row+2,col+1,i);

Markcell(arr,row-2,col+1,i);
Markcell(arr,row-2,col-1,i);

Markcell(arr,row-1,col+2,i);
Markcell(arr,row-1,col-2,i);

Markcell(arr,row+1,col+2,i);
Markcell(arr,row+1,col-2,i);
}
for(int j=0;j<king;j++)
{
Mark(arr,row+1,col,i)
Mark(arr,row-1,col,i)
Mark(arr,row,col-1,i)
Mark(arr,row,col+1,i)
}
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
public static void Markcell(String arr[][],int row,int col,int i)
{
if((row>=0&&row<=7)&&(col>=0&&col<=7))
arr[row][col]=Integer.toString(i);
}
}
public static void Mark(string arr[][],int row,int col,j)
{
if((row>=0&&row<=7)&&(col>=0&&col<=7))
 arr[row][col]=Integer.toString(i);
}