import java.net.URL;

public class url_class_demo {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://chat.openai.com/");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host name: " + url.getHost());
            System.out.println("Port number: " + url.getPort());
            System.out.println("File name: " + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
