import java.net.*;
import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            URL url = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt");
            URLConnection connection = url.openConnection();
            InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // create a HashMap to store the phonebook data
            HashMap<String, String> contact = new HashMap<String, String>();

            String line;
            while ((line = reader.readLine()) != null) {
                // split the line by the delimiter (",") and store the data in the HashMap
                String[] parts = line.split(" ");
                String name = parts[0].trim();
                String phoneNumber = parts[1].trim();
                contact.put(name, phoneNumber);
            }

            reader.close();

            // To find the phone number of Abdul, you can use the get() method of HashMap
            String abdulPhoneNumber = contact.get("Abdul");
            System.out.println("Abdul's phone number is: " + abdulPhoneNumber);
            String AbbiePhoneNumber = contact.get("Abbie");
            System.out.println("Abbie's phone number is: " + AbbiePhoneNumber);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
