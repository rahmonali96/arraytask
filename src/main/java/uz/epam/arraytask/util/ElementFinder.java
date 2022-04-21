package uz.epam.arraytask.util;

import uz.epam.arraytask.entity.CustomArray;

public class ElementFinder {
    public int findIndex(CustomArray customArray, int element) {
        int[] ints = customArray.getInts();
        int index = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == element) {
                index = j;
                break;
            }
        }
        return index;
    }
}
