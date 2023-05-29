public class InterpolationSearch {

    // Interpolation search is an improvment of binary search , it start by seeting a guess of the position of the target value
    // and the based on the value of that index it will set the low and high index
    InterpolationSearch(int value) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = interpolationSearch(array, value);

        if(index == -1) {
            System.out.println("Sorry, this items does not exist");
        }else {
            System.out.println("The index of the value is : " + index);
        }

    }
    private static int interpolationSearch(int array[], int value){
        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){
            int prob = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            if(array[prob] == value){
                return prob;
            }else if(array[prob] < value)  {
                low = prob + 1;
            }else {
                high = prob - 1;
            }
        }
        return -1;
    };
}
