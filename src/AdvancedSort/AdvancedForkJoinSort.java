package AdvancedSort;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

class AdvancedParallelMergeSort extends RecursiveAction {
    private final int[] array;
    private final int[] tempArray; // Shared auxiliary array
    private final int left, right;
    private static final int THRESHOLD = 5000; // Dynamic threshold for switching to sequential sort

    public AdvancedParallelMergeSort(int[] array, int[] tempArray, int left, int right) {
        this.array = array;
        this.tempArray = tempArray;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if (right - left < THRESHOLD) {
            Arrays.sort(array, left, right + 1); // Use efficient built-in sort for small sections
            return;
        }

        int mid = left + (right - left) / 2;

        AdvancedParallelMergeSort leftTask = new AdvancedParallelMergeSort(array, tempArray, left, mid);
        AdvancedParallelMergeSort rightTask = new AdvancedParallelMergeSort(array, tempArray, mid + 1, right);

        invokeAll(leftTask, rightTask); // Run tasks in parallel

        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        System.arraycopy(array, left, tempArray, left, right - left + 1);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            array[k++] = (tempArray[i] <= tempArray[j]) ? tempArray[i++] : tempArray[j++];
        }

        while (i <= mid) array[k++] = tempArray[i++];
        while (j <= right) array[k++] = tempArray[j++];
    }
}

public class AdvancedForkJoinSort {
    public static void main(String[] args) {
        int size = 20_000_000; // Large dataset for performance testing
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        int[] tempArray = new int[size]; // Shared auxiliary array

        ForkJoinPool pool = new ForkJoinPool();
        AdvancedParallelMergeSort task = new AdvancedParallelMergeSort(array, tempArray, 0, array.length - 1);

        long startTime = System.currentTimeMillis();
        pool.invoke(task);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted (First 10 elements): " + Arrays.toString(Arrays.copyOf(array, 10)) + "...");
        System.out.println("Time Taken: " + (endTime - startTime) + " ms");
    }
}