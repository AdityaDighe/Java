public class exp12 {
    public static void main(String args[]) {
    int valid, invalid, i, num;
    valid = invalid = i = 0;
    for (i = 0; i < args.length; i++) {
    try {
    num = Integer.parseInt(args[i]);
    }
    catch (NumberFormatException e) {
    
    invalid++;
    System.out.println("Invalid Argument : " + args[i]);
    continue;
    }
    
    valid++;
    }
    System.out.println("Total valid Arguments : " + valid);
    System.out.println("Total invalid Arguments : " + invalid);
    }
    }