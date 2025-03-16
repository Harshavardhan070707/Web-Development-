import java.util.Scanner;

public class java45 {
        public static void main(String[] args){
        System.out.print("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.print("Enter the starting index:");
        int s=sc.nextInt();
        System.out.print("Enter the endind index:");
        int e= sc.nextInt();
        String small=a.substring(s,e);
        sc.close();
        System.out.print("The sliced string is: "+small+"\n");
        }
    }
