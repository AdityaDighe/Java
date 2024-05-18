public class exp1_2 {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int count=0;
        while(num>0) { 
            num /=10;
            count++;
        }
        System.out.println(count);
    }
}
