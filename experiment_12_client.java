import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            DatagramSocket clientSocket = new DatagramSocket();
            String message = "Hello Server";
            byte[] sendData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            System.out.println("Message sent to server: " + message);
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
