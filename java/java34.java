import java.util.*;

public class java34 {
        public static int multiple(int x,int y){
      int prdt= x*y;
      return prdt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        sc.close();
        int mulp=multiple(a,b);
        System.out.print("The multiple of "+a+" and " +b+" is: "+mulp+"\n");
    }
}
