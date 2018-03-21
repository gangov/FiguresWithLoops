import javafx.css.Size;

import java.util.Scanner;

public class diamond {

    //repeating method
    static String repeatMe(String toRepeat, int timesToRepeat) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < timesToRepeat; i++) {
            string.append(toRepeat);
        }

        return string.toString();
    }

    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        if (size % 2 != 0) {
            for (int rowOdd = 1; rowOdd <= size; rowOdd++) {
                System.out.print(repeatMe("-", (size - rowOdd) / 2));
                System.out.print(repeatMe("*", rowOdd));
                System.out.print(repeatMe("-", (size - rowOdd) / 2));
                System.out.println();
            }
        } else {
            for (int rowEven = 1; rowEven <= size - 1; rowEven++) {
                System.out.print(repeatMe("-", (size - 1) / 2));
                System.out.print(repeatMe("**", 1));
                System.out.print(repeatMe("-", (size - 1) / 2));
                System.out.println();
            }
        }
    }
}
