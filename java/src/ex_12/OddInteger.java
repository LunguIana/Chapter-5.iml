package ex_12;
public class OddInteger {
    public static void main( String[] args )
    {
        int i,x = 1;
        System.out.print("\nThe odd numbers 1-15 are\n");

        for (i = 1; i <= 15; i+= 2)
        {
            x= i*x;
            System.out.print("\n" +i);
        }
        System.out.print("\nProduct : " +x);
    }
}
