import java.util.Scanner;
public class exp2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a b and c");
double a = input.nextInt();
double b = input.nextInt();
double c = input.nextInt();
double deter = b * b - 4 * a * c;
if (deter > 0) {
double deter_root = Math.sqrt(deter);
System.out.println("Root 1=" + (-b + deter_root) / (2 * a));
System.out.println("Root 2=" + (-b - deter_root) / (2 * a));
} else if (deter == 0) {
double deter_root = Math.sqrt(deter);
System.out.println("Root 1=Root 2" + (-b + deter_root) /
(2 * a));
} else {
double deter_root = Math.sqrt(-deter);
double real = -b / (2 * a);
double img = deter_root / (2 * a);

System.out.println("Root 1=" + real+"+"+img+"i");
System.out.println("Root 1=" + real+"-"+img+"i");
}
input.close();
}
}
