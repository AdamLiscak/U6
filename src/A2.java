public class A2 {
    public static void main(String[] args) {
        int[] a= new int[10];
        for (int i=1;i<a.length+1;i++)
        {
            a[i-1]=i;
        }
        for (int k:a)
        {
            System.out.println(k);
        }
    }
}
