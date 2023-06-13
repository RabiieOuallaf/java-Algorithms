public class MergeSort {
    // Mergesort = a divide and conquer sorting algorithm with a time complexity of o(n log n )
    // and a worse case scenario of n(n2)
    // It's faster than algorithms like bubble sort .. but it use more space
    // space complexity = o(n)

    MergeSort(){
        int array[] = {8,4,3,2,5,7,1,0};

        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1)  return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];


        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }

        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray); // keep dividing the array recursively
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = array.length - leftSize;
        int i = 0,l = 0, r = 0; // indices

        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }
}
