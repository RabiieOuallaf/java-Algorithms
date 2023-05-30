public class InsertionSort {
    // Insertion sort  = after comparing elements to the left
    //                   shift elements to the right and make room to insert a value
    //                  Time complexity = Quadric time
    InsertionSort() {
        int array[] = {9,5,1,3,10,4,7,8};

        insertionSort(array);

        for(int i : array) {
            System.out.println(i+" ");
        }


    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        };
    }
}
