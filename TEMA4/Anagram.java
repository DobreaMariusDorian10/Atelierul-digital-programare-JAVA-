import java.util.*;
import java.net.*;
import java.io.*;
public class Anagram {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Introduceti un cuvant ");
        String CuvantInput = sc.nextLine();              //reads string
        System.out.print("You have entered: "+CuvantInput+"\n");
        try {
            URL url = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt");
            InputStream input = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            StringBuilder cuvinte = new StringBuilder();
            String line=reader.readLine();
            while ((line = reader.readLine()) != null) {
                   cuvinte.append(line+" ");
            }
          String listaCuvinte=cuvinte.toString();

          String[] strSplit = listaCuvinte.split(" ");

            Map<Character, Integer> charFreq = new HashMap<>();
            for (int i = 0; i <CuvantInput.length(); i++) {
                char c = CuvantInput.charAt(i);
                if (charFreq.containsKey(c)) {                          //key-urile pentru cuvantul introdus de la tastatura
                    charFreq.put(c, charFreq.get(c) + 1);
                } else {
                    charFreq.put(c, 1);
                }
            }

            //itereaza pe fiecare cuvant
            for(int i=0;i<strSplit.length;i++) {
                //creaza pentru fiecare cuvant un map
                Map<Character, Integer> charFreqListaCuvinte = new HashMap<>();
                //iti itereaza pe caractere pentru fiecare cuvant ca si la input (functia de la linia 25-33)
                for (int j = 0; j <strSplit[i].length(); j++) {
                    char c = strSplit[i].charAt(j);
                    if (charFreqListaCuvinte.containsKey(c)) {
                        charFreqListaCuvinte.put(c, charFreqListaCuvinte.get(c) + 1);
                    } else {
                        charFreqListaCuvinte.put(c, 1);
                    }
                }
                boolean equal = charFreqListaCuvinte.entrySet().equals(charFreq.entrySet());
            if(equal){
                System.out.println(strSplit[i]+" ");
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
