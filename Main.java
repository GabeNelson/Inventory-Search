/**
 *  Program #5
 *  This program takes the contents of a file, adds each item into a list,
 *  sorts the list into alphabetical order, and searches for the item that the user wants
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a key for what you wan to find. The index of the key will be returned.");
        Tokenizer token = new Tokenizer();
        //File file = new File(".");
        //for(String fileNames : file.list()) System.out.println(fileNames);
        token.tokenizeFile("example.txt");


    }
}


