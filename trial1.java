import java.util.Scanner;

import java.util.*;

public class trial1 {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int x = sc.nextInt();
        
        int i,j;
        for(i=0;i<x;i++)
        {
            if(i%2!=0)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
            }
            else
            {
                for(j=i;j>0;j--)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
