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

        for (int row = 1; row <= size; row++) {

        }
    }
}
