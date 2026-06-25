package Advance_Java.stream_api.parallel_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class concept {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq2 : " + (endSeq - startSeq)/1000 + " sec");
        System.out.println("Para : " + (endPara - startPara)/1000 + " sec");
    }
}
