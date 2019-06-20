package org.linuxyong.utils.sort;

import org.junit.Test;

import java.util.Random;

/**
 * Created by yongly on 2019/6/20.
 */
public class SortPerformanceTest {
    static private final String OUTPUT_FORMAT =
            "Milliseconds for sort with Size: %d \n" +
            "\tBubbleSort: %d \n" +
            "\tInsertionSort: %d \n" +
            "\tQuickSort: %d \n\n";


    @Test
    public void test() {
        long[] array = generateTestCase(10000);
        testPerformance(array);

        array = generateTestCase(50000);
        testPerformance(array);

        array = generateTestCase(100000);
        testPerformance(array);

        array = generateTestCase(500000);
        System.out.println(spendTime(new QuickSort(), array));
        array = generateTestCase(1000000);
        System.out.println(spendTime(new QuickSort(), array));
        array = generateTestCase(5000000);
        System.out.println(spendTime(new QuickSort(), array));
        array = generateTestCase(10000000);
        System.out.println(spendTime(new QuickSort(), array));
    }

    private void testPerformance(long[] array) {
        long bubbleTime, insertionTime, quickTime;

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        QuickSort quickSort = new QuickSort();

        long[] array1 = array.clone();
        long[] array2 = array.clone();

        quickTime = spendTime(quickSort, array2);
        insertionTime = spendTime(insertionSort, array1);
        bubbleTime = spendTime(bubbleSort, array);

        System.out.println(String.format(OUTPUT_FORMAT, array.length, bubbleTime, insertionTime, quickTime));
    }

    private long spendTime(Sort sort, long[] array) {
        long startTime = System.currentTimeMillis();
        sort.sort(array);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private long[] generateTestCase(int size) {
        Random random = new Random();
        long[] res = new long[size];
        for (int i = 0; i < size; ++i) {
            res[i] = random.nextLong();
        }
        return res;
    }
}
