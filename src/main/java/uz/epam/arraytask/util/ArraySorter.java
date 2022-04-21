package uz.epam.arraytask.util;

import uz.epam.arraytask.entity.CustomArray;

public class ArraySorter {
    public void bubbleSort(CustomArray customArray) {
        int[] ints = customArray.getInts();
        int length = ints.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }
}
