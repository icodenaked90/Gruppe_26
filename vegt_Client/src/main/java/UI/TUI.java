package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TUI {
    int usernumber;
    int batchnumber;


    Scanner scan = new Scanner(System.in);
    // "Main menu" method. Takes user input and sends them in a direction.
    public void show() {
        boolean menuActive = true;

        while (true){


            //første dialog hvor den spørger om bruger nummeret
            while (true) {
                System.out.print("indtast brugernumber");
                usernumber = scan.nextInt();

                if(usernumber>10 || usernumber<100){

                    break;
                }
            }

            //her burde den kalde på in user metode
            while (true) {

                System.out.print("er det den rigtige bruger [ja/nej]");
                String janej =scan.next();

                if(janej.equalsIgnoreCase("ja")){
                    break;
                }
            }


            // her spørges der om et batch nummer
            while (true) {
                System.out.println("indtast batchnummer");
                batchnumber=scan.nextInt();

                if(usernumber>999 || usernumber<10000){

                    break;
                }
            }
            System.out.println("");

            System.out.println("vægten skal være ubelastet [tryk enter for at fortsætte]...");
            scan.nextLine();
            System.out.println("");

            System.out.println("placere tara (tom beholder)  på vægten[tryk enter for at fortsætte]... ");
            scan.nextLine();
            System.out.println("");

            System.out.println("placere beholder og indhold  på vægten[tryk enter for at fortsætte]... ");
            scan.nextLine();
            System.out.println("");

            System.out.println("fjern alt fra vægten[tryk enter for at fortsætte]... ");
            scan.nextLine();
            System.out.println("");

            System.out.println("ok... din måling er foretaget [tryk e for at exit]");
            String waitng= scan.nextLine();

            if(waitng.equalsIgnoreCase("e")){
                break;
            }
        }
        scan.close(); // close scanner
    }


}
