public class GenericSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    // Swap elements if they are in the wrong order
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }

            // After each pass, the largest element is guaranteed to be at the end
            // Reduce the range to sort only the unsorted part of the array
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        // Example usage with integers
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting:");
        printArray(intArray);

        // Sorting integers
        bubbleSort(intArray);

        System.out.println("\nAfter sorting:");
        printArray(intArray);

        // Example usage with strings
        String[] strArray = {"apple", "orange", "banana", "grape", "kiwi"};
        System.out.println("\nBefore sorting:");
        printArray(strArray);

        // Sorting strings
        bubbleSort(strArray);

        System.out.println("\nAfter sorting:");
        printArray(strArray);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}