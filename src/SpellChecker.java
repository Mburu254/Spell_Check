import java.util.*;
import java.io.*;



/**
 * Created by paulo on 10/10/15.
 */

/**
 * The SpellChecker class is used to check spelling in a given document
 */
public class SpellChecker {
    public static void readFile(File file)
            throws IOException {

    }
    public static void analyseFile(File file)
            throws IOException {
        LevenshteinDistance.calcDist();
    }

    public static void main(String[] args)
            throws java.io.IOException{
        if (args.length != 2 ) {
            System.out.println("Do spell check on a text file and perform corrections");
            System.exit(0);
        }
        BufferedInputStream file,dict;

        try{
            file  = new BufferedInputStream(new FileInputStream("/home/paulo/Documents/document.txt"));
            dict  = new BufferedInputStream(new FileInputStream("/home/paulo/Documents/dictionary.txt"));


        }
        catch (IOException e){
            System.out.println("Check your file name");
            System.exit(0);
        }
        File inputfile= null;
        Scanner scan = null;

        int wordCount = 0;
        while (scan.hasNextLine()) {
            String word = scan.nextLine();
            LinearSearch.addWord(word);
        }
        scan.close();
    }

}
