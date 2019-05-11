package udp;

import java.io.IOException;

public class MainForClient {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        String echo = client.sendEcho("Hello!");

        System.out.println(echo);
        client.close();
    }
}
