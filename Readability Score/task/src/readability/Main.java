package readability;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(in);

        File text = new File(args[0]);

        int nbChar = 0;
        int nbWords = 0;
        int nbSentences = 0;

        try {
            nbWords = getNbWord(text);
            nbChar = getNbChar(text);
            nbSentences = getNbSentences(text);
        } catch(IOException e) {
            System.out.println("Erreur d'entrée / sortie.");
        }

        double score = 4.71 * (double)nbChar / (double)nbWords + 0.5 * (double)nbWords / (double)nbSentences - 21.43;

        System.out.println("Words: " + nbWords);
        System.out.println("Sentences: " + nbSentences);
        System.out.println("Characters: " + nbChar);
        System.out.println("The score is: " + score);

        switch  ((int)Math.ceil(score)) {
            case 1:
                System.out.println("This text should be understood by 5-6 year olds.");
                break;
            case 2:
                System.out.println("This text should be understood by 6-7 year olds.");
                break;
            case 3:
                System.out.println("This text should be understood by 7-9 year olds.");
                break;
            case 4:
                System.out.println("This text should be understood by 9-10 year olds.");
                break;
            case 5:
                System.out.println("This text should be understood by 10-11 year olds.");
                break;
            case 6:
                System.out.println("This text should be understood by 11-12 year olds.");
                break;
            case 7:
                System.out.println("This text should be understood by 12-13 year olds.");
                break;
            case 8:
                System.out.println("This text should be understood by 13-14 year olds.");
                break;
            case 9:
                System.out.println("This text should be understood by 14-15 year olds.");
                break;
            case 10:
                System.out.println("This text should be understood by 15-16 year olds.");
                break;
            case 11:
                System.out.println("This text should be understood by 16-17 year olds.");
                break;
            case 12:
                System.out.println("This text should be understood by 17-18 year olds.");
                break;
            case 13:
                System.out.println("This text should be understood by 18-24 year olds.");
                break;
            case 14:
                System.out.println("This text should be understood by 24+ years old.");
                break;

        }
    }

    public static int getNbWord(File text) throws IOException {

        int nbWords = 0;
        Scanner scanner = new Scanner(text);

        while (scanner.hasNext()) {
            nbWords++;
            scanner.next();
        }

        return nbWords;
    }

    public static int getNbChar(File text) throws IOException {

        int nbChar = 0;
        Scanner scanner = new Scanner(text);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] sArray = s.split(" ");
            int nbCharLine = 0;
            for (int i = 0; i < sArray.length; i++) {
                nbCharLine += sArray[i].length();
            }
            nbChar += nbCharLine;
        }

        return nbChar;
    }

    public static int getNbSentences(File text) throws IOException {

        int nbSentences = 0;
        Scanner scanner = new Scanner(text);

        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            String sWithSpaces = s.replace("!", " ! ").replace("?", " ? ");
            System.out.println(s);
            String[] sArray = sWithSpaces.split("[.] | [!] | [?]");

            nbSentences += sArray.length;
        }

        return nbSentences;
    }
}
