import java.util.Scanner;

public class java39 {
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
        System.out.print("Enter the elements to search:");
        int a =sc.nextInt();
        sc.close();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(array[i][j]==a)
                {
                    System.out.print("The element is in row: "+i+"and column of: "+j+".");
                }
                else{
                    System.out.print("Element is not found.");
                }
            }
        }
    }
}
