import java.util.*;
class exp3{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=4;
int num,nums[],digits[];
nums=new int[size];
digits=new int[size];
num=sc.nextInt();
for(int i=0;i<4;i++)
{
digits[i]=(num/(int)Math.pow(10,size-i-1))%10;
}
System.out.println();
nums[0]=digits[0]*10+digits[1];
nums[1]=digits[1]*10+digits[0];
nums[2]=digits[2]*10+digits[3];
nums[3]=digits[3]*10+digits[2];
if(nums[0]*nums[2]==num||nums[0]*nums[3]==num||nums[1]*nums[2]==num||nums[0]*nums[3]==num)
{
System.out.println(num+" is vampire");
}
else
{
System.out.println(num+" is not vampire");
}
}
}
