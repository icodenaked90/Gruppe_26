package UI;

import java.util.List;
import java.util.Scanner;
public class TUI {
    Scanner scan = new Scanner(System.in);
    // "Main menu" method. Takes user input and sends them in a direction.
    public void showMenu() {
        boolean menuActive = true;

        do {
            System.out.print("press ENTER to continue...");
            scan.nextLine();
            System.out.println("");
            System.out.println("--- Main Menu ---\n(1) Afvej Ingrediens\n(2) Vis ingredienser\n(3) Exit\n--- Main Menu ---");
            int menu = scan.nextInt();

            switch (menu)
            {
                case 1:
                    //1)  Ask for user number

                    //2)  Ask for batch number

                    break;
                case 2:

                    break;

                case 3:
                    menuActive = false;
                    break;

                default: break;
            }

        } while (menuActive == true);

        scan.close(); // close scanner
    }


}
