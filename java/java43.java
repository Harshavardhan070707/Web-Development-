import java.util.Scanner;

public class java43 {
        public static void main(String[] args){
        System.out.print("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sc.close();
        int n = a.length();
        for(int i=0;i<n;i++)
        {
            System.out.println("The index "+i+" have "+a.charAt(i)+" letter.\n");
        }
    }
}
