import java.util.Scanner;

public class squareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int side = Integer.parseInt(scan.nextLine());

        side -= 1;

        for (int row = 0; row <= side; row++) {
            for (int col = 0; col <= side; col++) {
                // first and last row
                if (row == 0 || row == side) {
                    if (col == 0 || col == side) {
                        System.out.print("+");
                    } else if (col > 0 && col < side){
                        System.out.print("-");
                    }
                  // any other row
                }  if (row > 0 && row < side){
                    if (col == 0 || col <= side) {
                        System.out.print("|");
                    } else if (col != 0 && col < side) {
                        System.out.print("-");
                    }
                }
            }

            System.out.println();
        }
    }
}
