package readability;

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        String[] words = text.split(" ");
        String[] sentences = text.split("[!\\.+\\?]");

        double numberOfWords = words.length;
        double numberOfSentences = sentences.length;

        if (numberOfWords / numberOfSentences > 10) {
            out.println("HARD");
        } else {
            out.println("EASY");
        }
    }
}
