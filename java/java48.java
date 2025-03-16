import java.util.Scanner;

public class java48 {
    public static void main(String[] args) {
        System.out.print("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String name1= sc.nextLine();
        StringBuilder name=new StringBuilder();
        name.append(name1);
        sc.close();
        for(int i=0;i<name.length()/2;i++)
        {
        int s=i;
        int l=name.length()-i-1;
        
        char f=name.charAt(s);
        char b=name.charAt(l);

        name.setCharAt(s,b);
        name.setCharAt(l,f);
        }
        System.out.print("The reversed string is: "+name+"\n");
}
}
