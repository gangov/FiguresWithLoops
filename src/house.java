import java.util.Scanner;

public class house {
    static String repeatMe (String toRepeat, int timesToRepeat) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < timesToRepeat; i++) {
            string.append(toRepeat);
        }
        
        return string.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        // roof
        for (int roof = 1; roof <= (size + 1) / 2; roof++) {
            if (size % 2 == 0) {
                System.out.print(repeatMe("-", roof));
                System.out.print(repeatMe("**", roof));
                System.out.print(repeatMe("-", roof));
            } else {
                System.out.print(repeatMe("-", roof));
                System.out.print(repeatMe("*", ++roof));
                System.out.print(repeatMe("-", roof));
            }
            System.out.println();
        }
    }
}
