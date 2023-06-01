import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s=0;;
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(i=0;i<n;i++)
        {
            c[i]=(int)Math.sqrt(b[i]);
        }
        for(i=0;i<n;i++)
        {
            if(c[i]*c[i]==a[i])
            {
                s=s+a[i];
            }
        }
        System.out.println(s);
    }
}