import java.util.Scanner;
public class exp6_2 {
// gcd lcm
static public int gcd(int a, int b) {
if (b == 0) {
return a;
}
return gcd(b, a % b);
}
static int lcm(int a, int b) {
return (a / gcd(a, b)) * b;
}
static int dig = 0;
static int s = 0;
// reverse
static int solve(int n) {
if (n != 0) {
dig = dig * 10 + n % 10;
solve(n / 10);
}

return dig;
}
// sum of digits
static int sum(int n) {
if (n != 0) {
s = s + n % 10;
sum(n / 10);
}
return s;
}
static int sum = 0;
static int solveN(int nth) {
if (nth > 0) {
sum = sum + nth;
solveN(nth - 1);
}
return sum;
}
static int a = 0;
static int b = 1;
static int c = 0;
static int m = 1;
static void fibo(int n) {
if (n > 0) {
c = a + b;
System.out.print(c + " ");
a = b;
b = c;
fibo(n - 1);
}
}
static int multi(int x, int y) {
if (y > 0) {
m = m * x;
multi(x, y - 1);
}
return m;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the function");
System.out.println("1) To find GCD and LCM");
System.out.println("2) To find X^Y ");
System.out.println("3) To print n Fibonacci numbers");
System.out.println("4) To find reverse of number ");
System.out.println("5) To 1+2+3+4+..+ (n-1)+n");
System.out.println("6) Calculate the sum of digits of a number ");
int fn = input.nextInt();
switch (fn) {

case 1:
int temp;
System.out.println("Enter the two numbers:");
int a = input.nextInt();
int b = input.nextInt();
if (a < b) {
temp = a;
a = b;
b = temp;
}
System.out.print("GCD is :");
System.out.println(gcd(a, b));
System.out.print("LCM is :");
System.out.println(lcm(a, b));
break;
case 2:
System.out.println("Enter the x and y value");
int x = input.nextInt();
int y = input.nextInt();
if (y == 0) {
System.out.println("Answer:" + 1);
} else {
System.out.println("Answer:" + multi(x, y));
}
break;
case 3:
// fibo
a = 0;
b = 1;
System.out.println("Enter the nth value");
int count = input.nextInt();
System.out.print(a + " ");
System.out.print(b + " ");
fibo(count - 2);
break;
case 4:
System.out.println("Enter the number");
int n = input.nextInt();
System.out.println("reverse is " + solve(n));
break;
case 5:
System.out.println("Enter the nth value");
int nth = input.nextInt();
for (int i = 1; i <= nth; i++) {
if (i == nth) {
System.out.print(i);
} else {
System.out.print(i + "+");
}
}

System.out.print("=" + solveN(nth));
break;
case 6:
System.out.println("Enter the number");
int m = input.nextInt();
System.out.println("Sum is " + sum(m));
break;
default:
System.out.println("Invalid input");
}
}
}