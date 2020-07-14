package Part3;

public class Practice2 {

    public static void main(String[] args) {
        
        int num = 7;
        twoBase(num);

    }

    public static void twoBase(int num) {

        if(num == 0) {
            return;
        } else {
            twoBase(num / 2);
            System.out.print(num % 2);
        }

    }
    
}