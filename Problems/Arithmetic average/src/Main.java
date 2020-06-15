import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double sum = 0;
        double count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }

        out.println(sum / count);
    }
}