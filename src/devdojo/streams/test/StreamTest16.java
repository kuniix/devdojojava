package devdojo.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate (long num){
        System.out.println("sum iterate");
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        Long end = System.currentTimeMillis();
        System.out.println(reduce + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate (long num){
        System.out.println("sum parallel iterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        Long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
