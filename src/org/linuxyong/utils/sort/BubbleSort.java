package org.linuxyong.utils.sort;

/**
 * Created by yongly on 2019/6/19.
 */
public class BubbleSort implements Sort {
    @Override
    public long[] sort(long[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j+1]) {
                    long temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
