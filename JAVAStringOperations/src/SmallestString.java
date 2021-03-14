import java.util.Scanner;
public class SmallestString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        String[] a = S.split(" ");
        String SmallString = a[0];
        for(String word : a)
        {
            if (word.length() < SmallString.length())
                SmallString = word;
        }
        System.out.println("Smallest length String : "+SmallString);
    }
}
