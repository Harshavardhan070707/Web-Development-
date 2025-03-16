import java.util.*;
public class java5 {
    public static void main(String[] args) {
        System.out.print("Enter a number in 1, 2 & 3:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        switch(a)
        {
            case 1:
            {
                System.out.println("Hi");
                break;
            }
            case 2:
            {
                System.out.println("Hello");
                break;
            }
            case 3:
            {
                System.out.println("Bay");
                break;
            }
            default:
            {
                System.out.println("Sorry");
                break;
            }
        }
    }
    
}
