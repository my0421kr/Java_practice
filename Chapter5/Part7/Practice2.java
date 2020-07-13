package Part7;

public class Practice2 {

    public static void main(String[] args) {
        
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if( 11*i + 11*j == 99 ) {
                    System.out.println("A: " + i + " " + "B: " + j);
                }
            }
        }

    }
    
}