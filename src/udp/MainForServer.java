package udp;

import java.io.IOException;

public class MainForServer {
    public static void main(String[] args) throws IOException {

        Server server = new Server();
        server.run();
    }
}
