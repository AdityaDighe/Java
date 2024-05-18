import java.util.Scanner;
public class exp2_2
{
public static void main(String args[])
{
int a,b,ch;
Scanner sc = new Scanner(System.in);
    System.out.println("1.Addition\n2.subtraction\n3.Multiplication\n4.Modulus\n5.Division\n");
    System.out.println("Enter the values of a & b: ");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Enter Your Choice: ");
    ch=sc.nextInt();

switch(ch)
{
case 1:
int result=a+b;
System.out.println("sum of A and B is "+ result);
break;
case 2:
int result1=a-b;
System.out.println("Subtraction of A and B is" +result1);
break;
case 3:
int result2=a*b;
System.out.println("Multiplication of A and B is" +result2);
break;
case 4:
int result3=a%b;
System.out.println("Modulud of A and B is" +result3);
break;
case 5:
int result4=a/b;
System.out.println("Divisionof A and B is" +result4);
break;
default:
System.out.println("Invalid choice Please try again: ");
}
}
}































