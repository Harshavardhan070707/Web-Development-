import java.util.Scanner;

public class java16 {
        public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {   
                if(j<=i)
                {
                    System.out.print(" ");
                }
                else
                {
                     System.out.print("*");         
                }
            }
            System.out.println("");       
        }
    }
}
