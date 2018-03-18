import java.util.Scanner;

public class rombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int side = Integer.parseInt(scan.nextLine());

        //printing rows UPPER PART
        for (int row = 0; row < side; row++) {

            //printing empty space
            for (int emp = 1; emp < side - row; emp++) {
                System.out.print(" ");
            }

            //printing stars
            for (int star = side; star >= side - row; star--) {
                if (star == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        //printing rows LOWER PART
        for (int rowL = 1; rowL <= side - 1; rowL++) {

            //printing empty space
            for (int empL = side - 1; empL >= side - rowL; empL--) {
                System.out.print(" ");
            }

            //printing stars
            for (int starL = 0; starL < side - rowL; starL++) {
                if (starL == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" *");
                }            }
            System.out.println();
        }

    }
}
