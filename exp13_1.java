import java.util.*;

class Five implements Runnable {
public void run() {
long start = System.currentTimeMillis();
for (int i = 1; i <= 10; i++) {
System.out.println("5 * " + i + " = " + (5 * i));
try {
Thread.sleep(1000);
} catch (Exception e) {
}
}
long end = System.currentTimeMillis();
System.out.println("Time taken by Five table " + (end - start));

}
}

class Seven implements Runnable {
public void run() {
long start = System.currentTimeMillis();
for (int i = 1; i <= 10; i++) {
System.out.println("7 * " + i + " = " + (7 * i));
try {
Thread.sleep(1000);
} catch (Exception e) {
}
}
long end = System.currentTimeMillis();
System.out.println("Time taken by Seven table " + (end - start));
}

}

class Thirteen implements Runnable {
public void run() {
long start = System.currentTimeMillis();
for (int i = 1; i <= 10; i++) {

System.out.println("13 * " + i + " = " + (13 * i));
try {
Thread.sleep(1000);

} catch (Exception e) {
}
}
long end = System.currentTimeMillis();
System.out.println("Time taken by Thirteen table " + (end - start));
}
}

public class exp13_1{
public static void main(String args[]) {
Five five = new Five();
Seven seven = new Seven();
Thirteen thirteen = new Thirteen();
Thread tA = new Thread(five);
Thread tB = new Thread(seven);
Thread tC = new Thread(thirteen);
tA.start();
tB.start();
tC.start();
}
}