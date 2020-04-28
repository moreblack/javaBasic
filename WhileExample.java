
public class WhileExample {
public static void main(String[] args){
    int sum = 0;
    for (int i = 1; i <= 5; i++){
        sum = sum + i;
    }
    //while 사용
    int i = 1;
    while(i <= 5) {
       
        i++;
        sum = sum + i;    
    }
    //while ...
    i = 1;
    while(true){
        sum = sum + i;
        if (i > 5){
            break;
        }
      i++;
    }
    
}

}