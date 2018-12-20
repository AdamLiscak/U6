import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A4
{
    public static void main(String[] args) {


        List<Integer> a = new ArrayList<>();
        Random rand = new Random();
        int max = rand.nextInt(50);
        for (int i = 0; i < max; i++)
        {
a.add(rand.nextInt(50));
        }

        for(Integer i:a)
        {
            System.out.println(i);
        }
    }
}
