import java.util.Scanner;
public class Toggle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        char[] a = S.toCharArray();
        String Toggle="";
        for(int i=0;i<S.length();i++)
        {
            if(Character.isUpperCase(a[i]))
                Toggle+=Character.toLowerCase(a[i]);
            else
                Toggle+=Character.toUpperCase(a[i]);
        }
        System.out.println("Toggled String : "+Toggle);
    }
}