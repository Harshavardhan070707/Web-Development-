import java.util.*;
public class java33 {
    public static int add(int x,int y){
      int add= x+y;
      return add;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        sc.close();
        int sum=add(a,b);
        System.out.print("The sum of "+a+" and " +b+" is: "+sum+"\n");
    }
}
