package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    static String hostName = "127.0.0.1";
    static int portNumber = 8000;
    public static void main(String[] args) throws IOException {


        // Initialization
        Socket echoSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("connection to server: "+echoSocket.isConnected());
        String userInput;
        System.out.print("User: ");
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server: " + in.readLine());
            System.out.println();
            System.out.print("User: ");
        }


    }

    public String sendMessage(String command) throws IOException{
        Socket echoSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

        // Instead of a while loop, this code will run every time the user talks to the server from the TUI
        command = stdIn.readLine();
        out.println(command);
        String message = "Server: "+in.readLine();

        // Close all io
        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
        // Returns whatever the server outputs from the command that is given
        return message;
    }


}