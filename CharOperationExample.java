
public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;  //int에 5를담는다
        int v2 = 2;  //int에 2를담는다

        int result = v1 / v2;   //2.5가되어야하는데 정수만 나오니까 2나옴
        double result1 = (double) v1 / v2; //2.5 더블타입 소수도 담을수 있슴
        System.out.println(result1);
    
    
        result = sum(10,15);
        System.out.println("result:" + result);
        
        result1 = minus(v1 , v2);

        System.out.println("result:" + result1);

        double result2 = divide(v1 , v2);
        System.out.println("result:" + result2);

    }

    public static int sum(int num1, int num2){
        int result = num1 + num2;
        return result;
    //end of sum
    }
    public static int minus(int num1, int num2){//minus 는 그냥 이름만 새겨주고 int result값은 실제 계산값
        int result = num1 - num2;
        return result;
    }//end of minus

    public static double divide(int num1, int num2){
        double result2 = (double)num1 / num2;
        return result2;
    }





}