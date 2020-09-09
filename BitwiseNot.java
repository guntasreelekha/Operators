package BitwiseOperators;

public class BitwiseNot {
    public static void main(String args[]) {
        int x = 42;
        //x=00101010
        System.out.println("The value of x:" + x);
        int y = ~x;
        //y=11010101
        System.out.println("The value of y :" + y);
    }
}

