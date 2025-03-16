import java.util.Scanner;

public class java11 {
        public static void main(String[] args) {
        System.out.print("Enter the n for its table:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++)
        {
          System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
