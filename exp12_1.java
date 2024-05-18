import java.util.*;
import java.io.*;
class MarksOutOfBoundException extends Exception {
MarksOutOfBoundException(String err) {
System.out.println(err);
}
}

public class exp12_1 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int m, m2, m3, seatNo, centerNum, choice = 1;
String name, date;
while (choice == 1) {
try {
System.out.println("Enter the Seat Number : ");
seatNo = in.nextInt();
String str1 = in.nextLine();
System.out.println("Enter Name of Student : ");
name = in.nextLine();
System.out.println("Enter the Center Number : ");
centerNum = in.nextInt();
String str = in.nextLine();
System.out.println("Enter Date : ");
date = in.nextLine();
System.out.println("Enter the Marks in Java : ");
m = in.nextInt();
System.out.println("Enter the Marks in DS : ");
m2 = in.nextInt();
System.out.println("Enter the Marks in DIS : ");
m3 = in.nextInt();
Marks(seatNo, centerNum, date, name, m, m2, m3);
}
catch (Exception e) {
System.out.println(e);

}
System.out.println("\nEnter your choice : \n1.Enter more Student data \n2.Exit ");
choice = in.nextInt();
}
}
public static void Marks(int seatNo, int centerNo, String date, String
name, int marks, int marks2, int marks3)
throws MarksOutOfBoundException {
if (marks >= 100 || marks <= 0) {
throw new MarksOutOfBoundException(
"Input marks of all subjects should be greater than 0 and less than 100");
} else if (marks2 >= 100 || marks2 <= 0) {
throw new MarksOutOfBoundException(
"Input marks of all subjects should be greater than 0 and less than 100");
} else if (marks3 >= 100 || marks3 <= 0)
{
throw new MarksOutOfBoundException(
"Input marks of all subjects should be greater than 0 and less than 100");
}
else
{
System.out.println("\nStudent Details :\nName : " + name +
"\nSeat Number: " + seatNo + "\nCenter Number : "
+ centerNo + "\nDate : " + date);
System.out.println("Marks in Java : " + marks + "\nMarks in DS : "

+ marks2 + "\nMarks in DIS : " + marks3);
}
}
}
