public class BinarySearch {
    public int recursiveBinarySearch(String[] numbers, int lowIndex, int highIndex, String key) {
        if(lowIndex > highIndex){
            return -1;
        }

        int midpoint = (highIndex + lowIndex) / 2;
        if(numbers[midpoint].compareTo(key) == 0){
            return midpoint;
        }
        else if(numbers[midpoint].compareTo(key) < 0){
            return recursiveBinarySearch(numbers, midpoint + 1, highIndex, key);
        }
        else{
            return recursiveBinarySearch(numbers, lowIndex, midpoint - 1, key);
        }
    }

    public void print(){

    }
    }

