import java.util.*;
public class java4 {
    public static void main(String[] args) {
        System.out.print("Enter the first Number:");
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        System.out.print("Enter the second Number:");
        int no2=sc.nextInt();
        sc.close();
        if(no1==no2)
        {
            System.out.println("Numbers are equal");
        }
        else if(no1 > no2)
        {
            System.out.println("First number is greater");
        }
        else
        {
            System.out.println("Second number is greater");  
        }
    }
}