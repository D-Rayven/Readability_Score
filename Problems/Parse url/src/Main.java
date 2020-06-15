import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);

        String url = scanner.nextLine();
        boolean pass = false;
        String password = "";

        String[] part = url.split("html"); //
        String[] parameters = part[1].split("&");

        for (int i = 0; i < parameters.length; i++) {
            String[] output = parameters[i].split("=");
            if (i == 0) {
                output[0] = output[0].substring(1);
            }
            if (output.length == 1) {
                out.println(output[0] + " : not found");
            } else {
                out.println(output[0] + " : " + output[1]);
            }
            if (output[0].equals("pass") && output.length == 2) {
                pass = true;
                password = output[1];
            }
        }
        if (pass) {
            out.println("password : " + password);
        }
    }
}