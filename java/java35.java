import java.util.*;
public class java35 {
    public static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
        else
        {
            int i=1;
            int fact=1;
            while(i<=n)
            {
                fact*=i;
                i++;
            }
            return fact;
        }
      }
    public static void main(String[] args){
        System.out.print("Enter a number to get its factorial:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.print("The factorial of "+a+" is:"+factorial(a)+"\n");
    }
}
