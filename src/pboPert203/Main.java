package pboPert203;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        int sum;

        firstNumber = JOptionPane.showInputDialog("masukkan angkan pertama");
        secondNumber = JOptionPane.showInputDialog("masukkan angka kedua");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 * number2;

        JOptionPane.showMessageDialog(null, "hasil = " + sum);

        System.exit(0);
    }
}