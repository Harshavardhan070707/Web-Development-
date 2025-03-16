import java.util.*;

public class java28 {
        public static void main(String[] args){
        System.out.print("Enter the value:");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 ||j==1 || i==n ||j==n)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
