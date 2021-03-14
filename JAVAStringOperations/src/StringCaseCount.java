import java.util.Scanner;
public class StringCaseCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String T = sc.nextLine();
        int i,u=0,l=0;
        char[] a = T.toCharArray();
        for(i=0;i<T.length();i++)
        {
            if(Character.isUpperCase(a[i]))
                u++;
            else
                l++;
        }
        if(u==l)
            System.out.println("Equally Distributed");
        else
            System.out.println(T);
    }
}