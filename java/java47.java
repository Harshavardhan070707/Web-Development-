import java.util.*;
public class java47 {
    public static void main(String[] args) {
        System.out.print("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String name1= sc.nextLine();
        StringBuilder name=new StringBuilder();
        name.append(name1);
        sc.close();
        int a=0;
        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)==name.charAt(name.length()-i-1))
            {
                a=1;
            }

            else
            {
                a=0;
            }
        }
        if(a==1)
        {
            System.out.print("String is palindrom");
        }
        else
        {
            System.out.print("String is not a palindrom\n");
        }
    }
}
