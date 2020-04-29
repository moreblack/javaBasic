
public class ForRemindExample {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 11; i++) {

            System.out.println(i);
        
            sum = sum + i;
        if (i % 2 == 0) {


            System.out.println("짝수 입니다.");

        } else {

            System.out.println("홀수 입니다.");

        }
    }
    System.out.println("sum : "+ sum);

    }
}