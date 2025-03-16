import java.util.Scanner;

public class java10 {
        public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int total=0;
        for(int i=0;i<=n;i++)
        {
          total = total + i;
        }
        System.out.println("Total sum is:"+total);
    }
}
