package Part6;

public class Practice1 {
    
    public static void main(String[] args) {
        
        int num = 0;
        int count = 0;

        for(num=1; num<=100; num++) {

            if( (num % 5) == 0 && (num % 7) == 0 ) {
                count++;
                System.out.println(num);
            }

        }

        System.out.println("count : " + count);

    }

}