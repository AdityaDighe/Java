import java.util.Scanner;
interface Sports{
int score=100;
void member_score();
}
class Student{
int roll_no;
void read(int n){
roll_no = n;
}
void display(){
System.out.println(roll_no);
Student

Test;

Result

Sports;

}
}
class Test extends Student{
int sem1_marks,sem2_marks;
void read1(int n){
sem1_marks = n;
}
void read2(int n){
sem2_marks = n;
}
void display(){
System.out.println(sem1_marks+sem1_marks);
}
}
class Result extends Test implements Sports{
public void member_score(){
int total;
total = sem1_marks+sem2_marks+score;
System.out.println("The total score is "+total);
}
}
public class exp10 {
public static void main(String args[]){
Scanner s = new Scanner(System.in);
Result r = new Result();
System.out.println("Enter roll no.");
int roll = s.nextInt();
System.out.println("Enter sem1.");
int sem1 = s.nextInt();
System.out.println("Enter sem2.");
int sem2 = s.nextInt();
r.read(roll);
r.read1(sem1);
r.read2(sem2);
r.member_score();
}
}