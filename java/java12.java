import java.util.*;
public class java12 {
    public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
