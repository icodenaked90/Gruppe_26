import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    private String userInput;

    public void startMenu() throws IOException {

        int brugernummer = 1234;
        int batchnummer = 4321;
        System.out.println("velkommen til vægten, Indtast brugernummer");
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() == brugernummer) {
            connection("D ”TEST” crlf");
            System.out.println("Velkommen bruger1");
            System.out.println("Indtast ønskede batch nummer");
            if (scan.nextInt() == batchnummer) {
                System.out.println("du har valgt salt");

            }
        }
    }

        public void connection(String userInput) throws IOException {
            this.userInput = userInput;
            String hostName = "127.0.0.1";
            int portNumber = 8000;


        Socket echoSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Is connected: " + echoSocket.isConnected());
        out.println(userInput);
        System.out.println( in.readLine());


        }
}

