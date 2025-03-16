import java.util.Scanner;

public class java19 {
    
        public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=(n-i);j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
