import java.util.Scanner;

/**
 * @author chamodshehanka on 10/20/2018
 * @project BitsNBytes
 **/
public class MagicSpell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String[] spells = new String[N];

        for (int i = 0; i < N; i++) {
            spells[i] = scanner.nextLine();
            System.out.println(spells[i]);
        }
    }
}
