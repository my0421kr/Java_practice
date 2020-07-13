package Part2;

public class Practice2 {
    
    public static void main(String[] args) {
        
        int num = 15678;
        int num1 = ( num - ( (num >> 3) << 3 ) ) >> 2;
        int num2 = ( num - ( (num >> 5) << 5 ) ) >> 4;

        System.out.println(num1);
        System.out.println(num2);

    }

}