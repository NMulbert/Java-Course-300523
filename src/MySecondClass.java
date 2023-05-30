import java.util.Scanner;

public class MySecondClass {
    Scanner myScanner = new Scanner(System.in);
    public MySecondClass(int a) {
        System.out.println("My parameter is: " + a);
    }

    public MySecondClass(int a,int b) {
        System.out.println("My parameters are: " + a + " and " + b);
    }

    public static int DoubleMe(int a){
        return a*2;
    }
}
