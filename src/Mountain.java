public class Mountain {

     /**
      * @param array an array of positive integer values
      * @param stop the last index to check
      *             Precondition: 0 <= stop < array.length
      * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ; false otherwise
     */

    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; ++i) {
            if (array[i] >= array[i+1]) return false;
        }
        return true;
    }

    /** @param array an array of positive integer values

     @param start the first index to check
     Precondition: 0 <= start < array.length - 1
     @return true if for each j such that start <= j < array.length - 1,
     array[j] > array[j + 1];

     false otherwise

     */

    public static boolean isDecreasing(int[] array, int start) {
        for (; start < array.length - 1; ++start) {
            if (array[start] <= array[start+1]) return false;
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        try {
            for (int i = 1; i < array.length-1; ++i) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        int peakIdx = getPeakIndex(array);
        if (peakIdx == -1) return false;

        return isIncreasing(array, peakIdx) && isDecreasing(array, peakIdx);
    }

}