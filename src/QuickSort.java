public class QuickSort {

    QuickSort(){
        int[] array = {1,7,6,4,9,0,2,10,12};

        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.println(i + " ");
        }
    }

    private void quickSort(int[] array, int start, int end) {

        if(end <= start) return; // base case
        int pivot = partition(array,start,end);
        quickSort(array,start,pivot - 1);
        quickSort(array,pivot + 1,end);

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }


        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;

    }

}
