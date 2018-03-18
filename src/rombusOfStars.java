import java.util.Scanner;

public class rombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int side = Integer.parseInt(scan.nextLine());
        
        for (int upperRow = 1; upperRow <= side ; upperRow++) {
            for (int col = 1; col <= side; col++) {
                System.out.print(" . ");
            }

            System.out.println();
        }
    }
}
