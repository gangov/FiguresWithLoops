import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //print top of tree
        for (int top = 0; top < n; top++) {
            System.out.print(" ");
        }
        System.out.println(" | ");

        for (int i = 1; i < n + 1; i++) {


            //print left side of tree
            // empty space
            for (int left = 1; left <= n - i; left++) {
                System.out.print(" ");
            }
            // stars
            for (int leftStar = n; leftStar > n - i; leftStar--) {
                System.out.print("*");
            }
            System.out.print(" | ");
            //print right side of tree
            // stars
            for (int rightStar = n; rightStar > n - i; rightStar--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
