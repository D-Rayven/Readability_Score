import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // put your code here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        out.println((c - b) / a);
    }
}