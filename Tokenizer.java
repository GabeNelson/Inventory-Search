/**
 *  Program #5
 *  This class scans in a file, tokenizes the contents, and outputs a new file
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenizer {
    private ArrayList<Token> tokens;

    public Tokenizer(){
        tokens = new ArrayList<Token>();
    }
    /**
     * takes input file and tokenizes the contents
     * @param filePath
     * @throws IOException
     */
    public void tokenizeFile(String filePath) throws IOException{
       for(int i = 0; i < tokens.size(); i++){
           tokens.remove(i);
       }
       File file = new File(filePath);
       Scanner scnr = new Scanner(file);
       while(scnr.hasNext()){
           String tempString = scnr.nextLine();
           tokens.add(new Token(tempString));
       }
       writeTokens();
    }
    /**
     * writes tokens out to an output file
     * @throws IOException
     */
    public void writeTokens() throws IOException{
        File file = new File("output.txt");
        PrintWriter tokenPrinter = new PrintWriter(file);
        DataStructure list = new DataStructure();
        QuickSort sort = new QuickSort();
        BinarySearch search = new BinarySearch();
        Scanner scnr = new Scanner(System.in);
        String key = scnr.nextLine();
        for(int i = 0; i < tokens.size(); i++){
            list.add(tokens.get(i).toString());
            sort.quickSort(list.getArray(),0, list.getArray().length - 1);
            System.out.println(search.recursiveBinarySearch(list.getArray(), 0, list.getArray().length - 1, key));
        }
        tokenPrinter.flush();
    }

    /**
     * changes tokens to string format
     * @return
     */
    @Override
    public String toString(){
        String string = tokens.toString();
        return string;
    }

    public String getToken(){
        String string = tokens.toString();
        return string;
    }

    public Token[] getTokens(){
        Token[] array = new Token[tokens.size()];
        return tokens.toArray(array);
    }
}
