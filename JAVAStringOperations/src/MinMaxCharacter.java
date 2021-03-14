import java.util.Scanner;
public class MinMaxCharacter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        int[] f = new int[S.length()];
        char x = S.charAt(0), y = S.charAt(0);
        int i, j, min, max;
        char[] a = S.toCharArray();
        for(i=0;i<a.length;i++)
        {
            f[i]=1;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[i]!=' ' && a[i]!='0')
                {
                    f[i]++;
                    a[j]='0';
                }
            }
        }
        min=max=f[0];
        for(i=0;i<f.length;i++)
        {
            if(min>f[i] && f[i]!='0')
            {
                min=f[i];
                x=a[i];
            }
            if(max<f[i])
            {
                max=f[i];
                y=a[i];
            }
        }
        System.out.println("Minimum Occurred Character : " + x);
        System.out.println("Maximum Occurred Character : " + y);
    }
}
