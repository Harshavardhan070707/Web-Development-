import java.util.*;
public class java38 {
    public static void main(String[] args) {
        System.out.print("Enter the row number of array:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print("Enter the column number of array:");
        int c=sc.nextInt();
        int array[][]=new int[r][c];
        System.out.println("Enter the array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The array elements are:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
