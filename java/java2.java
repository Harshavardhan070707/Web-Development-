import java.util.*;
public class java2 {
    public static void main(String[] args) {
        System.out.print("Enter the age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.close();
        if(age>17)
        {
            System.out.println("you are audlt!!");
        }
        else
        {
            System.out.println("you are not audlt");
        }
    }
    
}
