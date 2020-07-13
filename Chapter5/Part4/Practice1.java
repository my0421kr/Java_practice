package Part4;

public class Practice1 {
    
    public static void main(String[] args) {
        
        int num = 0;
        int sumOfNum = 0;

        while(num < 100) {

            sumOfNum += num;
            num++;

        }

        System.out.println("1 to 99 sum : " + sumOfNum);
    }

}