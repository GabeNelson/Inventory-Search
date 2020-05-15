/**
 *  Program #5
 *  This class partitions the inputted array and sorts the array into a new sorted array
 *  CS108-4
 *  5/14/2020
 *  @author  Gabe Nelson
 */
public class QuickSort{
    /**
     * partitions inputted number array into low numbers and high numbers
     * @param numbers
     * @param lowIndex
     * @param highIndex
     * @return
     */
    public int partition(String[] numbers, int lowIndex, int highIndex) {
        String pivot = numbers[highIndex];

        for (int i = lowIndex; i < highIndex; i++) {
            if (numbers[i].compareTo(pivot) < 0) {
                String temp = numbers[lowIndex];
                numbers[lowIndex] = numbers[i];
                numbers[i] = temp;
                lowIndex++;
            }
        }

        String temp = numbers[lowIndex];
        numbers[lowIndex] = pivot;
        numbers[highIndex] = temp;

        return lowIndex;
    }
    /**
     * recursively sorts the array from small small to large inputs
     * @param numbers
     * @param lowIndex
     * @param highIndex
     */
    public void quickSort(String[] numbers, int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            int partitionIndex = partition(numbers, lowIndex, highIndex);
            if((partitionIndex - 1) > lowIndex) {
                quickSort(numbers, lowIndex, partitionIndex - 1);
            }
            if((partitionIndex + 1) < highIndex)
            quickSort(numbers, partitionIndex + 1, highIndex);
        }
    }
}

