import java.util.*;

public class trail2 {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int c=0;

        int i,j;
        for(i=0;i<x;i++)
        {
            for(j=i;j<0;j++)
            {
                System.out.print("  ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(" "+(char)(c+65));
                c--;
            }
            System.out.println("");
            c=c+2*i;
        }
        sc.close();
    }
}
