import java.util.Scanner;

public class java42 {
        public static void main(String[] args){
        System.out.print("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sc.close();
        int n = a.length();
        System.out.print("The length of string is: "+n+"\n");
    }
}

