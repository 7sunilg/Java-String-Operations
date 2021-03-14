import java.util.Scanner;
public class StringRotate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        int l = S.length();
        String S1="";
        if(l%2==0)
        {
            S1+=S.charAt(l-1);
            for(int i=1;i<l;i++)
            {
                S1+=S.charAt(i-1);
            }
            System.out.println("Clock-wise Direction Rotation : "+S1);
        }
        else
        {
            for(int i=1;i<l;i++)
            {
                S1+=S.charAt(i);
            }
            S1+=S.charAt(0);
            System.out.println("Anti-Clockwise Direction Rotation : "+S1);
        }

    }
}