public class BubbleSort {
    // Bubble sort = comparing two elements and switch them
    // TimeComplexity = O (n SQUARE 2 )
    BubbleSort(){

        int array[] = {9,8,1,7,6,4,2,5};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }

    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length -1; i++) {
            for(int j = 0; j < array.length - i - 1;j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
