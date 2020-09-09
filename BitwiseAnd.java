package BitwiseOperators;

public class BitwiseAnd {
    public static void main(String args[]) {
        int a = 42;
        //a=00101010
        int b = 15;
        //b=00001111
        int c = a & b;
        System.out.println("The value of c :" + c);
    }
}

