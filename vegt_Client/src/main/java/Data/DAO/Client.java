package Data.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Det er meningen, at I kun bruger kommandoerne S, T, D, DW, P111 og RM20 8.

public class Client {

    // Fields
    String hostName = "127.0.0.1";
    int portNumber = 8000;

    public Client() throws IOException { // Midlertidig løsning
    }

    // Midlertidig main til testing
    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.manuelIndtastning();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Initialization
    Socket echoSocket = new Socket(hostName, portNumber); //Socket
    PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));


    // Methods
    public void manuelIndtastning() throws IOException {
        System.out.println("connection to server: " + echoSocket.isConnected());
        String userInput;
        System.out.print("User: ");
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server: " + in.readLine());
            System.out.println();
            System.out.print("User: ");
        }

    }


    public void getWeight() // S crlf			           			S S        5.234 kg  crlf //returnerer hvad vægten er lige nu
    {

    }

    public void getTaraWeight() // T crlf			    				T S        1.234 kg  crlf //vægt tarares
    {

    }

    public void printOnWeightDisplay() // D ”TEST” crlf		    			D A crlf     // skriver TEST i veje display
    {

    }

    public void printOnTextDisplay(String text) throws IOException // P111 ”TEST” crlf					P111 A crlf (plads op til 30 karakterer)
    {
        String command = "P111 \"";
        out.println(command+text+"\"");
    }

    public void displayWeight() // DW crlf			    				DW A  crlf //retunerer til vægt visning
    {

    }

    //RM20 8 ”INDTAST NR” ”” ”&3” crlf  			RM20 B crlf
    // Skriver INDTAST NR (lille display). Afventer indtastning (her 123), som så retunerer: RM20 A ”123” crlf
    public void printOnSmallAndWait() //  Virker mærkelig at bruge - kan ikke finde ud af den.
    {

    }



}