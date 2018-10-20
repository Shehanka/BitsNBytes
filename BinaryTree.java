import java.util.Arrays;
import java.util.Scanner;

public class BinaryTree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int length = string.length();

        char[] array = new  char[length];

        for (int i = 0; i < length; i++) {
            for(int k= length; k> i; k--){
                System.out.print(" ");
            }
            array[i] = string.charAt(i);
        }

        Arrays.sort(array);

        for (int i = 0; i < length; i++) {
            System.out.println(" "+ array[i]);
        }
    }
}
