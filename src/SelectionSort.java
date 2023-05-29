public class SelectionSort {
    // SelectionSort = serach through an array and keep track of the minimum value durning
    // each iteration . at the end of each iteration we swap the values
    // Time complexity = Quadratic time O(n Square 2);
    SelectionSort() {
        int[] array = {9,2,3,6,8,6,4};
        selectionSort(array);

        for(int i : array) {
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i < array.length -1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}
