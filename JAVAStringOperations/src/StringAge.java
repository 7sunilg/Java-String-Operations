import java.util.Scanner;
public class StringAge
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        int l = S.length();
        char a = S.charAt(l-1);
        int x;
        if(Character.isUpperCase(a))
        {
            x = a;
            System.out.println("Age of the String : "+(l+(x-64)));
        }
        else
        {
            x = a;
            System.out.println("Age of the String : "+(l+(x-96)));
        }
    }
}