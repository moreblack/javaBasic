
public class MethodExample1 {
    public static void main(String[] args) {
        printTriangle(5);   
        // printGugudan(3);   
        // printStar(3,"Hello");
        //printString("Good Morning","Hello KIM");
       
    } 
    public static void printTriangle(int star){
       
        
        for(int i = 1; i < star; i++);{
       
            int i = ("*");
            
         
        System.out.println(i);}
    }
     
    
    
    
    public static void printGugudan(int dan){
        System.out.println(dan +"단");
        for(int i = 1; i <= 9; i++){
        System.out.println(dan * i);}
    }
   
   
    public static void printString(String str,String name) {
        System.out.println(str +","+ name);
    }

    {

       PrintDouble(10, 3);
    }

    public static void PrintDouble(int a, int b) {
        System.out.println("결과 값은 : " + a * b);
    }

    // int result = sum(10, 20);
    // System.out.println("result1 : " + sum(10, 20));
    // System.out.println("result1 : " + sum(10, 20, 30));
    // System.out.println("1 ~ 10 합:" + toSum(1,10));}



    public static void printStar(int a, String str) {
        for (int i = 1; i <= a; i++)
            System.out.println("*****"+","+ str);
    }

    public static void printStar(int a, int b) {
        for (int j = a; j <= b; j++)
            System.out.println("*****");
    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;

    }
}
