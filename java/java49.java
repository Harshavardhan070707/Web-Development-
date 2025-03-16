import java.util.*;
public class java49 {
    public static void main(String[] args) {
        System.out.print("Enter the number to shift:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the right shift value:");
        int p=sc.nextInt();
        int bitmask=n>>p;
        sc.close();

        if((n & bitmask)==0)
        {
            System.out.print("Is zero\n");
        }
        else
        {
            System.out.print("Is non-zero\n");
        }
    }
}
