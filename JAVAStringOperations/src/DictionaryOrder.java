import java.util.Scanner;
public class DictionaryOrder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.nextLine();
        String[] a = S.split(" ");
        int l = a.length;
        String temp;
        String Dictionary="";
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a[i].compareToIgnoreCase(a[j])>0)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            Dictionary+=a[i]+" ";
        }
        System.out.println("Dictionary Order : "+Dictionary);
    }
}
