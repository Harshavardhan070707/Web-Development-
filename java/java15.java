import java.util.Scanner;

public class java15 {
    
    public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=(n);i>0;i--)
        {
            for(int j=(i);j>0;j--)
            {   
                System.out.print("*");
            }
            System.out.println("");       
        }
    }
}
