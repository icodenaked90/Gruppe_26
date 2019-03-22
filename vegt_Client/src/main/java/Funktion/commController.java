package Funktion;

import Data.DAO.Client;
import Data.DTO.UserDTO;
import java.util.*;
import java.io.IOException;
@SuppressWarnings("Duplicates")
public class commController{

    public void tui()throws InterruptedException, IOException {
        Client client = new Client();
        UserDTO user = new UserDTO();
        try {
            Scanner scan = new Scanner(System.in);
            client.printOnTextDisplay("Indtast operatørnummer");
            int userID = scan.nextInt();
            if(userID>=10 && userID<100){

                int id = user.getId();
                client.printOnTextDisplay("Name");
                // Brugeren indtaster deres nummer. Brug evt. scanner til at modtage og gemme
                client.printOnTextDisplay("Indtast batch nummer");
                int batchID = scan.nextInt();
                client.printOnTextDisplay("Vægten skal nu være ubelastet. Tryk ok for at godkende.");
                // Vægten tareres. Brugeren trykker enter.

                client.printOnTextDisplay("Venligst placer beholder på vægten");
                // Registrer vægten af beholderen
                double tarWeight1 = client.getWeight(); // Vægten tareres

                // Vægten vejer nu med beholder og produkt
                client.printOnTextDisplay("Venligst placer beholderen med produktet på vægten");
                double nettoWeight = client.getWeight(); // Nettovægten fås

                // Vægten vejer nu uden noget på.
                client.printOnTextDisplay("Venligst fjern beholderen fra vægten");
                double bruttoWeight = client.getWeight(); // Bruttovægten fås

                client.printOnTextDisplay("Alt er kasseret ordenligt. Farvel.");
                // Vægten tareres igen.
            }





        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
