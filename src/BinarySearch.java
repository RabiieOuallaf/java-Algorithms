public class BinarySearch {
    // Binary search = cutting a sorted array into the half and looking if the targeted value is less or equal or larger than the current pivot
    // Time Complexity = O(Log n)
    BinarySearch(int target) {
        int array[] = new int[100];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        int index = binarySearch(array,target);

        if(index == -1) System.out.print("Element not found!");
        System.out.println("element position is: "+ index);
    }

    private static int binarySearch(int[] array,int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int pivot = low + (high - low )/ 2;
            int value = array[pivot];

            System.out.println("Pivot :" + value);

            if(value < target) low = pivot + 1;
            else if(value > target) high = pivot - 1;
            else return pivot;

        }

        
        return -1;
    }
}
