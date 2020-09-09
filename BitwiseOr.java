package BitwiseOperators;

public class BitwiseOr {
    public static void main(String args[]) {
        int x = 42, y = 15;
        //x=00101010 and y=00001111
        int c = x | y;
        System.out.println("The value of c : " + c);
    }
}
