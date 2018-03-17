import java.util.Scanner;

public class dollarSignTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int side = Integer.parseInt(scan.nextLine());

        for (int col = 0; col < side; col++) {
            for (int row = 0; row <= col; row++) {
                if (row == col) {
                    System.out.print("$");
                } else {
                    System.out.print("$ ");
                }
            }

            System.out.println();
        }
    }
}
