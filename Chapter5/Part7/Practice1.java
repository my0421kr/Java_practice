package Part7;

public class Practice1 {
    
    public static void main(String[] args) {
        
        for(int i=2; i<=8; i+=2) {
            System.out.println(i + "단");
            for(int j=1; j<=i; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }

}