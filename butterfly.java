import java.util.Scanner;

    public class butterfly {

        public static void main (String [] a) {

            Scanner scanner = new Scanner (System.in);

            System.out.print ("Enter a number: ");
            int numbers = scanner.nextInt();

            for (int i = 1; i <= numbers; i++) {
                
                for (int j = 1; j <= i; j++) {
                    System.out.print ("*");
                }

                for (int j = 1; j <= 2 * (numbers - i); j++) {
                    System.out.print (" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print ("*");
                }

                System.out.println();
            }

            for (int i = numbers; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {
                    System.out.print ("*");
                }

                for (int j = 1; j <= 2 * (numbers - i); j++) {
                    System.out.print (" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print ("*");
                }

                System.out.println();
            }



        }
    }
