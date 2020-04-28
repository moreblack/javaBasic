
public class EvenSumExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // 2의 배수 또는 3의 배수를 출력하세요. 조건합: 조건A || 조건B
            if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println("2 또는 3의 배수:" + i);

            }
            // 2의 배수를 만족하고 3의 배수를 만족하는 수를 출력 조건A && 조건B
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2 와 3의 배수:" + i);
            }
            if (!(i % 2 == 0)){
                System.out.println("홀수값:"+ 1);
            }

        }

    }
}