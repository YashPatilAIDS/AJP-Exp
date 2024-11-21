import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            int portNumber = 8070;
            ServerSocket ss = new ServerSocket(portNumber);
            System.out.println("Server started on port: " + portNumber);

            Socket s = ss.accept();
            System.out.println("Client connected!");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String clientMessage = dis.readUTF();
            System.out.println("Client says: " + clientMessage);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello from Server!");
            dos.flush();

            ss.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
