/*Sample output: Input: "tHe quick brown fox jumps over the lazy dog. thE quick brown fox jumps over the Lazy dog_ the quick brown fox jumPs over the lazy dog. the quick brown foX juMps over the lazy dog. thE quick brown fox jumps over the lazy dog"
Output: HELP ME */
import java.net.*;
import java.io.*;
public class SecretMessage {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            URL url = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt");
            InputStream input = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            StringBuilder mesaj = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                mesaj.append(line);
            }
            for (int i = mesaj.length() - 1; i >= 0; i--) {
                mesaj.replace(0, mesaj.length(), mesaj.toString().replace("X", "*").replace("*", "\b"));
                char c = mesaj.charAt(i);
                if (!Character.isUpperCase(c)) {
                    mesaj.deleteCharAt(i);
                }
            }
            String mesajSecret = mesaj.toString();
            System.out.println(mesajSecret);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
