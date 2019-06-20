package org.linuxyong.utils.sort;

/**
 * Created by yongly on 2019/6/19.
 */
public class InsertionSort implements Sort {
    @Override
    public long[] sort(long[] array) {
        for (int i = 1; i < array.length; i++) {
            long temp = array[i];
            for (int j = i; j >= 0; --j) {
                if (j == 0 || temp > array[j-1]) {
                    array[j] = temp;
                    break;
                } else {
                    array[j] = array[j-1];
                }
            }
        }
        return array;
    }
}
