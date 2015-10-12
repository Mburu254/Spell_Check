import java.util.*;
import java.io.*;

/**
 * Created by paulo on 10/10/15.
 */
public class Dictionary {

    static String wordfile = "dictionary.txt";

    static ArrayList <String>wordlist = new ArrayList<String>();

    static HashMap <String, Integer>newlist = new HashMap<String, Integer>();

    public static void loadWords(String filename) throws IOException{
        String line;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        while((line = br.readLine()) != null){
            if(line.length()>2 && line.length()<26)
                wordlist.add(line);
        }
    }

}
