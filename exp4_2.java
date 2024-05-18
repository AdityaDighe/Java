import java.util.*;
class exp4_2 {
public static void main(String args[]) {
int i, n, x, count = 0;
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the vector array:");
n = scan.nextInt();
System.out.println("Enter " + n + " elements:");
Vector v = new Vector();
for (i = 0; i < n; i++) {
System.out.print("Enter the element for position " + (i + 1) + ":");
v.addElement(scan.nextInt());
}
System.out.println("Vector array:" + v);
System.out.print("Enter the element whose frequency to be known:");
x = scan.nextInt();
int startpos=0,newpos;
while(startpos<v.size())
{
newpos=v.indexOf(x,startpos);
if(newpos==-1)
{
break;
}
count++;
startpos=newpos+1;
}
System.out.print("Frequency:" + count);
}
}
