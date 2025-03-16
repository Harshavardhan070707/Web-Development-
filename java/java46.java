import java.util.*;

public class java46 {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the string:");
                String a=sc.nextLine();
                StringBuilder name= new StringBuilder();
                name.append(a);
                sc.close();
                
                System.out.print("Enter a charector to join the string:");
                char b=sc.next().charAt(0);
                name.append(b);
                System.out.println(name);

                System.out.print("Enter the index and the charector to insert:");
                int d=sc.nextInt();
                char q=sc.next().charAt(0);
                name.insert(d,q);
                System.out.println(name);

                System.out.print("Enter the indexs delete the charectors9starting and end index:");
                int e=sc.nextInt();
                int p=sc.nextInt();
                name.delete(e, p);
                System.out.println(name);

                System.out.println(name.charAt(0));
}
}
