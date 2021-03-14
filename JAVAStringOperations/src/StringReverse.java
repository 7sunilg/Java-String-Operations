import java.util.Scanner;
public class StringReverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = sc.next();
        System.out.print("Enter String 2 : ");
        String s2 = sc.next();
        StringBuilder s3 = new StringBuilder(s1);
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Reversed String : "+s3.reverse());
        }
        else
        {
            System.out.println("Reverse Not Supported");
        }
    }
}