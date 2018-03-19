import java.util.Scanner;

public class SunGlasses {

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int middle = ((size + 2 - 1) / 2);

        for (int rows = 0; rows < size; rows++) {
            if (rows == 0 || rows == size - 1){
                System.out.print(repeatStr("*", 2 * size));
                System.out.print(repeatStr(" ", size));
                System.out.print(repeatStr("*", 2 * size));
            } else {
                if (rows == middle - 1){
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                    System.out.print(repeatStr("|", size));
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");

                } else {
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");
                    System.out.print(repeatStr(" ", size));
                    System.out.print("*");
                    System.out.print(repeatStr("/", (2 * size) - 2));
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
