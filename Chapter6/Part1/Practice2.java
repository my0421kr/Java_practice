public class Practice2 {
    
    public static void main(String[] args) {
        
        calAbs(123, 456);
        calAbs(9898, 12);

    }

    public static void calAbs(int num1, int num2) {

        if(num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num2 - num1);
        }

    }

}