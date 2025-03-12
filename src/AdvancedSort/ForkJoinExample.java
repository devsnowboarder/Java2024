package AdvancedSort;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 5; // Threshold for splitting tasks
    private int[] array;
    private int start, end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) { // If task is small enough, compute directly
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;


        } else { // Otherwise, split task into two subtasks
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, mid);
            SumTask rightTask = new SumTask(array, mid, end);

            leftTask.fork(); // Execute left task in another thread
            int rightResult = rightTask.compute(); // Compute right task in current thread
            int leftResult = leftTask.join(); // Get result from left task

            return leftResult + rightResult; // Combine results
        }
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Fill array with numbers 1 to 20
        }

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(array, 0, array.length);

        int result = pool.invoke(task);
        System.out.println("Sum: " + result); // Should print 210 (sum of numbers from 1 to 20)
    }
}
