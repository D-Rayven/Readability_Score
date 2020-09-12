import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        while (!"0".equals(number)) {
            try {
                int nb = Integer.parseInt(number);
                System.out.println(nb * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + number);
            } finally {
                number = scanner.nextLine();
            }
        }
    }
}