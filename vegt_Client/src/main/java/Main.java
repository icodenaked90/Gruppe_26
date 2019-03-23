import Data.DAO.Client;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

    Client start = new Client();
    // Requires server to be open first
    start.run();
    }
}
