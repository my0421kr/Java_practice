package Part6;

public class Practice2 {
    
    public static void main(String[] args) {
        
        int num = 1;
        int sumOfNum = 0;

        while(true) {

            sumOfNum += num;

            if(sumOfNum > 1000) {
                System.out.println(sumOfNum);
                System.out.println(num);
                break;
            }

            num+=2;

        }

    }

}