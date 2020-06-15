import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);

        String chain = scanner.nextLine();
        char[] chainArray = chain.toCharArray();
        String res = "";
        int nbOccur = 1;
        for (int i = 1; i < chainArray.length; i++) {
            if (chainArray[i] == chainArray[i - 1]) {
                nbOccur++;
            } else {
                res += chainArray[i - 1];
                res += nbOccur;
                nbOccur = 1;
            }
        }

        res += chainArray[chainArray.length - 1];
        res += nbOccur;
        out.println(res);
    }
}