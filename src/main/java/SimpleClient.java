import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {

    public static void main(String[] args) throws IOException {
        try (Socket client = new Socket("Localhost", 1254); 
                InputStream inputstream = client.getInputStream();
                DataInputStream dis = new DataInputStream(inputstream)) {
            String st = dis.readUTF();
            System.out.println(st);
        }

    }
}
