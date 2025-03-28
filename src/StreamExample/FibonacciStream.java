package StreamExample;



import java.util.stream.Stream;



public class FibonacciStream {

    public static void main(String[] args) {

        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(10)  // Generate first 10 Fibonacci numbers
                .map(f -> f[0])
                .forEach(System.out::println);
    }
}
