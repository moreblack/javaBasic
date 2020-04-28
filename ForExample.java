
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1; // sum => 1
        sum = sum + 2; // sum => 3
        sum = sum + 3; // sum => 6
        sum = sum + 4; // sum =>10
        sum = sum + 5; // sum =>15
        sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i; // sum => 16
            System.out.println(i);
        }
        System.out.println("sum:"+ sum);
        System.out.println(2 + "*" + 1 + "=" + (2*1));
        System.out.println(2 + "*" + 2 + "=" + (2*2));
        System.out.println(2 + "*" + 3 + "=" + (2*3));

        for (int i = 1; i <10; i++){
        System.out.println(2 + "*" + i + "=" + (2*i));
        }
        int var1 = 6;
        for (int i = 1; i <= 9 ; i++){
            System.out.println(var1 + "*" + i + "=" + (var1*i));
        }
    }

}