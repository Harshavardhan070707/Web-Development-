import java.util.*;
public class java20 {
    public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<(n-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
