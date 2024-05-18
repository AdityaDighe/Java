import java.util.*;
class exp4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("How many elements are there in List : ");
int n = sc.nextInt();
Vector v = new Vector(n, 3);
for (int i = 0; i < n; i++) {
System.out.printf("Enter the item %d : ", i + 1);
String str = sc.next();
v.addElement(str);
}
System.out.println("\t\tOperation");
System.out.println("\t1)add at specific location");
System.out.println("\t2)Delete item");
System.out.println("\t3)Display list");
System.out.println("\t4)Exit");
int choice = 1;
while (choice != 4) {

System.out.print("Enter the choice : ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter the Location(index) : ");
int l = sc.nextInt();
System.out.print("Enter the item : ");
String str = sc.next();
v.add(l, str);
break;
case 2:
System.out.print("Enter the item want to delete : ");
String item = sc.next();
v.remove(item);
break;
case 3:
System.out.print("The elements in List are : " + v + "\n");
break;
case 4:
return;
default:
System.out.print("wrong choice ");
}
}
}
}