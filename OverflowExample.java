
public class OverflowExample {
    public static void main(String[] args){
        int x = 1000000;

        int y = 1000000;

        int z = x * y;
    
        long q = 1000000;

        long w = 1000000;

        long t = q * w;

        System.out.println(z);
        System.out.println(t);
    }

    
}