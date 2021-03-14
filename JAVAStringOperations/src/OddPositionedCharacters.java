import java.util.Arrays;
import java.util.Scanner;
public class OddPositionedCharacters
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        char[] a = S.toCharArray();
        Arrays.sort(a);
        String Odd="";
        for(int i=0;i<S.length();i++)
        {
            if(i%2!=0)
                Odd+=a[i];
        }
        System.out.println("Odd-Positioned Characters : "+Odd);
    }
}