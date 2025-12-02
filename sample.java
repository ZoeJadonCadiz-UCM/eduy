import java.util.Scanner;

    public class sample {

        public static void main (String [] a) {

            Scanner scanner = new Scanner (System.in);

            String [] names = new String [5];

            System.out.print ("Please enter 5 names: ");

            for (int i = 0; i < names.length; i++) {
                names [i] = scanner.nextLine();
            }

            for (int i = 0; i < names.length; i++) {
                for (int j = i + 1; j < names.length; j++) {
                    if (names [j].compareTo(names [i]) < 0) {
                        String temp = names [j];
                        names [j] = names [i];
                        names [i] = temp;
                    }
                }
            }

            System.out.print ("Asending order: ");
                for (int i = 0; i < names.length; i++) {
                    System.out.print (names [i] + " ");
                }
        }
    }
