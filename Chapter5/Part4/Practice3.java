package Part4;

public class Practice3 {

    public static void main(String[] args) {
        
        int num = 1;

        while(num <= 100) {

            if( (num % 2) == 0 && (num % 7) == 0 ) {
                System.out.println(num);
                num++;
            } else {
                num++;
            }
        }

    }
    
}