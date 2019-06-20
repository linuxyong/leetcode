package org.linuxyong.utils.sort;

/**
 * Created by yongly on 2019/6/19.
 */
public class QuickSort implements Sort {
    @Override
    public long[] sort(long[] array) {
        quickSort(array, 0, array.length-1);
        return array;
    }

    private void quickSort(long[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = findPivotIndex(startIndex, endIndex);
        int partitionedIndex = inPlacePartition(array, startIndex, endIndex, pivotIndex);
        quickSort(array, startIndex, partitionedIndex - 1);
        quickSort(array, partitionedIndex + 1, endIndex);

    }

    private int inPlacePartition(long[] array, int startIndex, int endIndex, int pivotIndex) {
        long pivot = array[pivotIndex];
        swap(array, pivotIndex, endIndex);
        int storedIndex = startIndex;

        for (int i = startIndex; i <= endIndex; ++i) {
            if (array[i] < pivot) {
                swap(array, i, storedIndex);
                storedIndex++;
            }
        }
        swap(array, storedIndex, endIndex);
        return storedIndex;
    }

    private int findPivotIndex(int startIndex, int endIndex) {
        return (startIndex + endIndex) / 2;
    }

    private void swap(long[] array, int index1, int index2) {
        if (index1 != index2) {
            long temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}
