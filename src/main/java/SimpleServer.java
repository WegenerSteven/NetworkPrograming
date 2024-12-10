
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1254)) {
            System.out.println("Server is listening on port 1254");
            while (true) {
                try (Socket socket = serverSocket.accept(); DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
                    dos.writeUTF("Hello, client!");
                }
            }
        }
    }
}
