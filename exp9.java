import java.util.*;

abstract class AreaOfShape {
double len1;
double len2;

AreaOfShape(double l1, double l2) {
len1 = l1;
len2 = l2;
}

abstract double area();

}

class Circle extends AreaOfShape {
Circle(double r) {
super(r, 0);
}

double area() {
return (3.14 * len1 * len1);
}
}

class Rectangle extends AreaOfShape {
Rectangle(double l1, double l2) {
super(l1, l2);
}

double area() {
return (len1 * len2);

}
}

class Triangle extends AreaOfShape {
Triangle(double l1, double l2) {
super(l1, l2);
}

double area() {
return (0.5 * len1 * len2);
}
}

public class exp9 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter radius of Circle : ");
double r = in.nextDouble();
Circle c = new Circle(r);
System.out.printf("Area of Circle is : %.4f sq.units", c.area());
System.out.println("\nEnter length of Rectangle : ");
double l = in.nextDouble();
System.out.println("Enter breadth of Rectangle : ");
double b = in.nextDouble();
Rectangle rectarea = new Rectangle(l, b);
System.out.printf("Area of Rectangle is : %.4f sq.units",
rectarea.area());
System.out.println("\nEnter height of Triangle: ");
double h = in.nextDouble();

System.out.println("Enter base length of Triangle : ");
double base = in.nextDouble();
Triangle triarea = new Triangle(h, base);
System.out.printf("Area of Triangle is : %.4f sq.units", triarea.area());
}

}