package Part2;

public class Practice2 {
    
    public static void main(String[] args) {
        
        int num;
        for(num = 1; num <= 100; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            } else {
                continue;
            }
        }

    }

    public static boolean isPrime(int num) {

        boolean result = true;

        if(num == 1) {
            result = false;
        } else {
            for(int i=2; (i*i)<=num; i++) {
                if(num % i == 0) {
                    result = false;
                    break;
                } else {
                    continue;
                }
            }
        }

        return result;

    } 

}