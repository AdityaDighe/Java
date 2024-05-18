import java.util.Scanner;

public class trail {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a, b and c");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double deter = b*b -4*a*c;
        if(deter>0) {
            double deter_root = Math.sqrt(deter);
            System.out.println("Root 1 = "+ (-b+deter)/(2*a));
            System.out.println("Root 2 = "+ (-b-deter)/(2*a));
        }
        else if (deter==0) {
            System.out.println("Root 1 = Root 2 = "+ (-b)/(2*a));
        }
        else {
            double deter_root = Math.sqrt(-deter);
            double deter_real = -b/(2*a);
            double deter_imag = deter_root/(2*a);
            System.out.println("Root 1 = "+ deter_real + " +i"+ deter_imag);
            System.out.println("Root 2 = "+ deter_real + " -i"+ deter_imag);
        }
        sc.close();
    }
}
