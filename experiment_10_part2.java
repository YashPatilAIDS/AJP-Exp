import java.io.InputStream;
import java.net.*;

public class url_connection_class {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://chat.openai.com/");
            URLConnection uc = url.openConnection();
            InputStream is = uc.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
