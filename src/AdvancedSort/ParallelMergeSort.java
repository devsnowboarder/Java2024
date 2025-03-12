package AdvancedSort;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ParallelMergeSort {
    private static final int THRESHOLD = 500;

    public static void parallelMergeSort(int[] array) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new MergeSortTask(array, 0, array.length - 1));
    }

    private static class MergeSortTask extends RecursiveAction {
        private final int[] array;
        private final int left;
        private final int right;

        MergeSortTask(int[] array, int left, int right) {
            this.array = array;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute() {
            if (right - left < THRESHOLD) {
                insertionSort(array, left, right);
                return;
            }
            int mid = left + (right - left) / 2;
            MergeSortTask leftTask = new MergeSortTask(array, left, mid);
            MergeSortTask rightTask = new MergeSortTask(array, mid + 1, right);
            invokeAll(leftTask, rightTask);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }

    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 6, 2, 8, 1, 4};
        parallelMergeSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
