import java.net.*;

public class inetClass {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println("IP Address of my PC: " + ia);
        
        ia = InetAddress.getByName("www.google.com");
        System.out.println("IP Address of host: " + ia);
        
        InetAddress SW[] = InetAddress.getAllByName("www.youtube.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
