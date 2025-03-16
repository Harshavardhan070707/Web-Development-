import java.util.Scanner;

public class java50 {
        public static void main(String[] args) {
        System.out.print("Enter the n value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the left shift value:");
        int p=sc.nextInt();
        int bitmask=1<<p;
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

