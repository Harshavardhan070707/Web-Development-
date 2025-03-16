import java.util.*;
public class java3 {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        sc.close();
        if(no%2 == 1)
        {
            System.out.println("Number is odd");
        }
        else
        {
            System.out.println("Number is even");
        }
    }
    
}
