
public class LinearSearch {
    // Linear serach  = Iterate through a collection one element at a time
    // Time complexity O(n)
    LinearSearch(int value) {
        int[] array = {9,5,4,3,7,8,2,12,98,33,656,743,0};
        int index = linearSearch(array, value);

        if(index != -1){
            System.out.print("Element found on index :" +index);
        }else {
            System.out.println("Sorry, this element does not exist");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length;i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
