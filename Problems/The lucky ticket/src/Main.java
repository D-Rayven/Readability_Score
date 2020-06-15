import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String ticket = scanner.nextLine();

        char[] ticketChar = ticket.toCharArray();
        int sumFirst = 0;
        int sumLast = 0;

        for (int i = 0; i < 3; i++) {
            sumFirst += Character.getNumericValue(ticketChar[i]);
        }

        for (int j = ticketChar.length - 1; j >= ticketChar.length - 3; j--) {
            sumLast += Character.getNumericValue(ticketChar[j]);
        }

        if (sumFirst == sumLast) {
            out.println("Lucky");
        } else {
            out.println("Regular");
        }
        // put your code here
    }
}