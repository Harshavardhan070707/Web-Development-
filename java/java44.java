import java.util.Scanner;

public class java44 {
        public static void main(String[] args){
        System.out.print("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.print("Enter the name:");
        String b=sc.nextLine();
        sc.close();
        if(a.compareTo(b)==0)
        {
            System.out.print("Both are equal!!\n");
        }
        else if(a.compareTo(b)==1)
        {
            System.out.print("String one is greater!!\n");
        }
        else
        {
            System.out.print("String two is greater!!\n");
        }
    }
}
