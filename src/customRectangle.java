import java.util.Scanner;

public class customRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int side = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
