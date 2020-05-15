/**
 *  Program #5
 *  This class sets the value of a token
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
public class Token {
    private String value;
    public Token(String valueToken){
        value = valueToken;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String temp){
        value = temp;
    }
    @Override
    public String toString(){
        return value;
    }
}
