import java.util.Scanner;
public class Merge
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String S1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String S2 = sc.nextLine();
        String Merge="";
        for(int i=0;i<S1.length()||i<S2.length();i++)
        {
            if(i<S1.length())
                Merge+=S1.charAt(i);
            if (i<S2.length())
                Merge+=S2.charAt(i);
        }
        System.out.println("Merged String : "+Merge);
    }
}