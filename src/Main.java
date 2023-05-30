import javax.swing.*;
import java.util.Arrays;

/**
 * @author Max Day
 * Created At: 2023/05/29
 */
public class Main {

    public static void main(String[] args) {
        int[] sArr = new int[5];
        int sum = 0;
        Arrays.setAll(sArr, i -> Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer"))); // this is so based
        for (int j : sArr) sum += j; // I could put this in another method but it just works like this
        System.out.printf("The average of the numbers is %.2f", (double) sum / sArr.length); // double division the %.2f is used to round and it looks cool so why not
    }
}