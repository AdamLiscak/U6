import javax.swing.*;

public class A1
{
    public static void main(String[] args) {
        if(compare(fill()))
        {
            System.out.println("erste 3 zeichen is gleich");
        }
        else
        {
            System.out.println(" erste 3 zeichen isnt gleich");
        }
    }
   public static String[] fill()
   {
       String[] a= new String[3];
       for (int i = 0; i < a.length; i++)
       {
           a[i]=JOptionPane.showInputDialog("Bitte was eingem");
       }
       return a;
   }

public static boolean compare(String[] a)
{
    boolean k=false;
    for (int i = 0; i < a.length; i++)
    {
        for (int j = i + 1; j < a.length; j++)
        {
            if (a[i].substring(0,3).equals(a[j].substring(0,3)))
            {
                k=true;
            }
        }
    }
    return k;
}
}