import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            int portNumber = 8070;

            Socket s = new Socket("localhost", portNumber);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello from Client!");
            dos.flush();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("Server says: " + str);
            
            s.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
