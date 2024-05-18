import java.util.*;
public class exp2_5_2{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num,temp=65,alpha,temp1=1;
num = sc.nextInt();

int count = num -1;
for(int i =1;i<=num;i++){
for(int k =1;k<=count;k++)

{
System.out.print(" ");
}
alpha = temp;
for(int j=1;j<=i;j++){
System.out.print((char)(alpha));
alpha--;
}
temp = temp + (++temp1);
System.out.println("\n");
count--;
}
}
}