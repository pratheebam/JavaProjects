import java.util.Scanner;
public class Pat
{    

    public static void main(String[] args) 
    {
        System.out.println("How many rows you want in this pattern");
         
        Scanner sc = new Scanner(System.in);
         
        int no = sc.nextInt();
         
        for (int i = no; i >=1; i--) //no=4
        {
         int value=0;
            for (int j = 1; j <=i; j++) 
          {
             value=value+j;
              }
                 for(int k=i-1;k>=0;k--)
              { 
                System.out.print(value-k+" ");
              }
            System.out.println();
       }
    }    
}
