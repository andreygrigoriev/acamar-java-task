package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int[] result = new int[input.length];
        int idxLeft = 0;
        int idxRight = input.length - 1;

        for(int i = idxRight; i >= 0; i--) {
            if (Math.abs(input[idxLeft]) > Math.abs(input[idxRight])) {
                result[i] = input[idxLeft] * input[idxLeft];
                idxLeft++;
            }
            else {
                result[i] = input[idxRight] * input[idxRight];
                idxRight--;
            }
        }

        return result;
    }
}
