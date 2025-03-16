import java.util.Scanner;

public class java37 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        int[] marks=new int[100];
        for(int i=0;i<marks.length;i++)
        {
            marks[i]= sc.nextInt();
        }
        System.out.print("Enter the element to search:");
        int s=sc.nextInt();
        sc.close();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==s)
            {
                System.out.print("The element "+s+" is in "+i+" index.");
            }
        }
}
}
