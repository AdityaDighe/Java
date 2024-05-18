import java.util.*;
public class exp2_3{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Enter the number");
x = sc.nextInt();
System.out.println("The odd number between 1 to "+x +" is");
for(int i=1;i<=x;i++){
if(i%2!=0){
System.out.print(i+" ");
}
}
System.out.println("\nThe prime number between 1 to "+x+" is");
int i,j,chk;
for(i=2; i<=x; i++)
{
chk = 0;
for(j=2; j<i; j++)
{
if(i%j==0)
{
chk++;
break;
}
}
if(chk==0)
System.out.print(i+" ");
}
} 
}