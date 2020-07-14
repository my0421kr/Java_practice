package Part3;

public class Practice1 {
    
    public static void main(String[] args) {
        
        int num = 10;
        System.out.println(twoPower(num));

    }

    public static int twoPower(int num) {

        if(num == 0) {
            return 1;
        } else {
            return 2 * twoPower(num-1);
        }

    }

}