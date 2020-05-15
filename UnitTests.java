/**
 *  Program #5
 *  This class makes unit test to check if the code works properly
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
public class UnitTests {
    String[] numberArray = new String[]{"a", "b", "c"};

    public static void main(String[] args){
        partitionTest();
        quickSortTest();
        recursiveBinarySearchTest();

    }
    public static void partitionTest(){
        String[] numberArray = new String[]{"b", "a", "c"};
        QuickSort test = new QuickSort();
        if(test.partition(numberArray, 0, numberArray.length - 1) != 0){
            System.out.println("Failed partition");
        }
        else{
            System.out.println("Successful partition");
        }
    }
    public static void quickSortTest(){
        String[] numberArray = new String[]{"b", "a", "c"};
        String[] sortedNumberArray = new String[]{"a", "b", "c"};
        boolean check = true;
        QuickSort test = new QuickSort();
        test.quickSort(numberArray, 0, numberArray.length - 1);
        for(int i = 0; i < numberArray.length; i++){
            if((numberArray[i]).compareTo(sortedNumberArray[i]) == 0){
                check = true;
            }
            else{
                check = false;
            }
        }
        if(check){
            System.out.println("Successful sort");
        }
        else{
            System.out.println("Failed sort");
        }
    }
    public static void recursiveBinarySearchTest(){
        BinarySearch test = new BinarySearch();
        String[] numberArray = new String[]{"b", "a", "c"};
        if(test.recursiveBinarySearch(numberArray, 0, numberArray.length - 1, "a") != 1){
            System.out.println("Failed search");
        }
        else{
            System.out.println("Successful search");
        }

    }

    }

