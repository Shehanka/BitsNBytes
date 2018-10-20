import java.util.Arrays;
import java.util.Scanner;

public class BinaryTree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int length = string.length();

        char[] array = new  char[length];

        for (int i = 0; i < length; i++) {
            array[i] = string.charAt(i);
        }

        Arrays.sort(array);

        for (int i = 0; i < length; i++) {
            for(int k= length; k> i; k--){
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if (i == 0){
                System.out.println();
            }
        }

//        triangle(5);
    }

    /*private static void triangle(int maxRows) {
        int r, num;
        for (int i = 0; i <= maxRows; i++) {
            num = 1;
            r = i + 1;
            //pre-spacing
            for (int j = maxRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }*/
}
