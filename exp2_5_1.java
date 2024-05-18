import java.util.*;
class exp2_5_1{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Enter the number of rows");

x = sc.nextInt();
for(int i=1;i<=x;i++){
if(i%2 !=0){
for(int j=1;j<=i;j++){
System.out.print(j+" ");
}
}
else{
for(int j=i;j>=1;j--){
System.out.print(j+" ");
}
}
System.out.println("\n");
} } }