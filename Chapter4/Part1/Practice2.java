package Part1;

public class Practice2 {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        boolean result;
        boolean flag1;
        boolean flag2;

        flag1 = (num1 += 10) < 0;
        flag2 = (num2 += 10) > 0;
        result = flag1 && flag2;
        System.out.println(result);
        System.out.println(num1);
        System.out.println(num2);

        flag1 = (num1 += 10) > 0;
        flag2 = (num2 += 10) > 0;
        result = flag1 || flag2;
        System.out.println(result);
        System.out.println(num1);
        System.out.println(num2);

    }

}