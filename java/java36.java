import java.util.*;
public class java36 {
    public static void main(String[] args){
        System.out.print("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] marks=new int[n];
        for(int i=0;i<n;i++)
        {
            marks[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("The array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
