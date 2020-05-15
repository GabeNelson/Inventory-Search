import java.util.LinkedList;

/**
 *  Program #5
 *  This class makes abstract methods to fulfill the requirement for an abstract class
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
public abstract class AbstractList {

    public abstract void add(String data);

    protected LinkedList<String> list;

    public AbstractList(){
        list = new LinkedList<>();
    }


}
