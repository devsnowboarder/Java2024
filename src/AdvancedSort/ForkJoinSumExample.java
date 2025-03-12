package AdvancedSort;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinSumExample {
    public static void main(String[] args) {
        int[] array = new int[1000000]; // A large array with 1 million elements

        // Fill the array with values
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Fill with values 1 to 1,000,000
        }

        // Create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Create and invoke the task to calculate the sum of the array
        SumTask task = new SumTask(array, 0, array.length);
        Integer result = pool.invoke(task);

        System.out.println("Sum of array: " + result);
    }

    // A RecursiveTask to sum a portion of the array
    static class SumTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start, end;

        SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            // Base case: if the subarray is small enough, sum it directly
            if (end - start <= 1000) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            }

            // Otherwise, split the task into two smaller tasks
            int middle = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, middle);
            SumTask rightTask = new SumTask(array, middle, end);

            // Fork the tasks (process them in parallel)
            leftTask.fork();
            rightTask.fork();

            // Join the results from the two tasks
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            // Return the combined result
            return leftResult + rightResult;
        }
    }
}