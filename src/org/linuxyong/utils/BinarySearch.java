package org.linuxyong.utils;

/**
 * Created by yongly on 2019/6/19.
 */
public class BinarySearch {
    /**
     * find whether the target number t exist in the sorted array
     * @param sortedArray the sorted array
     * @param t the target number
     * @return boolean
     */
    public boolean isExist(long[] sortedArray, long t) {
        int l = 0;
        int h = sortedArray.length;

        while (l < h) {
            int m = (l+h)/2;
            if (sortedArray[m] > t) {
                h = m;
            } else if (sortedArray[m] < t) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
