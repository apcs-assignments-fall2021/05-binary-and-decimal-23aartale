import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int x = Integer.parseInt(binary);
        int loop = 0;
        int sum = 0;
        while (x > 0){
            int lastDigit = x % 10;
            sum += lastDigit * (int) Math.pow(2, loop);
            x /= 10;
            loop += 1;
        }
        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        int x = 0;
        String str = "";
        if (decimal == 0){
            return "0";
        }
        while (decimal > 0){
            x = decimal % 2;
            str = x + str;
            decimal = decimal / 2;
        }
        return str;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(binaryToDecimal("100"));
        System.out.println(decimalToBinary(4));

    }
}
