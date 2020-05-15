/**
 *  Program #5
 *  This class scans in a file, tokenizes the contents, and outputs a new file
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
public class DataStructure extends AbstractList implements MyList {

    @Override
    public void add(String data) {
        list.add(data);
    }

    public String[] getArray() {
        String[] array = new String[list.size()];
        return list.toArray(array);
    }

}


