import java.util.Scanner;

public class java21 {
        public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int k = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {   
                k= k+1;
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
