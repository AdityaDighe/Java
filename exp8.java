import java.util.*;
class Shape{
int s1,s2;
Shape(int s){
s1=s;
s2=s;
}
Shape(int l ,int b){
s1=l;
s2=b;
}
float area(){
return s1*s2;
}
}
public class exp8 {
public static void main(String args[]){
Shape square=new Shape(6);
Shape rect=new Shape(4,5);
System.out.println("Area of Square of side 6 is " +square.area());
System.out.println("Area of Rectangle of length 4 and breadth 5 is "
+rect.area());
}
}