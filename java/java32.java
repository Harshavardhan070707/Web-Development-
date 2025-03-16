import java.util.*;
public class java32 {
    public static void printName(String n){
        System.out.println("Your name is:"+n);
        return;
    }
    public static void main(String[] agrs){
        System.out.print("Enter your name:");;
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        sc.close();
        printName(name);
    }
}
