import java.util.Scanner;
import java.math.BigInteger;
import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression;

        System.out.println("Give me a number: ");
        expression = sc.nextLine();

        BigInteger ex = new BigInteger(expression);
        System.out.println("string in numbers: " + ex);

        BigInteger divexe = ex.divide(BigInteger.valueOf(17));
        System.out.println("divided 17: " + divexe);

        int radix = 2;
        String Binary = divexe.toString(radix);
        System.out.println("now in binary: " + Binary);

        StringBuffer bin = new StringBuffer(Binary);

        int length = bin.length();
        System.out.println();

        Canvas canv = new Canvas();
        JFrame w = new Window();
        w.add(canv);

        while (length < 1802) {
            String plus = "0";
            bin.insert(0, plus);
            length = bin.length();
        }
        canv.setString(bin);

        w.setSize(1200, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);

    }
}
