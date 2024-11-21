import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        int port = 9876;
        DatagramSocket serverSocket = new DatagramSocket(port);
        System.out.println("Server started on port: " + port);
        byte[] receiveData = new byte[1024];

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String message = new String(receivePacket.getData()).trim();
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            System.out.println("Received message from client: " + message);
        }
    }
}
