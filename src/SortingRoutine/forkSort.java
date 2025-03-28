package SortingRoutine;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
import java.util.Arrays;

class ParallelMergeSort extends RecursiveTask<int[]> {
    private int[] array;

    public ParallelMergeSort(int[] array) {
        this.array = array;
    }

    @Override
    protected int[] compute() {
        if (array.length <= 1) {
            return array;  // Base case: single-element or empty array is already sorted
        }

        int mid = array.length / 2;

        // Split into two halves
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Create tasks for each half
        ParallelMergeSort leftTask = new ParallelMergeSort(left);
        ParallelMergeSort rightTask = new ParallelMergeSort(right);

        // Fork left task (execute in parallel)
        leftTask.fork();
        int[] rightResult = rightTask.compute(); // Compute right half in current thread
        int[] leftResult = leftTask.join(); // Wait and get left half result

        // Merge both halves
        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            result[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}

public class forkSort {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 6, 2, 8, 1, 4};

        ForkJoinPool pool = new ForkJoinPool(); // Create ForkJoin thread pool
        ParallelMergeSort task = new ParallelMergeSort(array);

        int[] sortedArray = pool.invoke(task); // Start sorting

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}