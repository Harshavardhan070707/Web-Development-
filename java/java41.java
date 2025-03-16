import java.util.Scanner;

public class java41 {
        public static void main(String[] args){
        System.out.print("Enter the first name:");
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        System.out.print("Enter the second name:");
        String name2=sc.nextLine();
        sc.close();
        String fname=name1+name2;
        System.out.print("Your full name is: "+fname+"\n");
    }
}
