package uz.epam.arraytask;

import uz.epam.arraytask.entity.CustomArray;
import uz.epam.arraytask.sorter.CustomArraySorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {9, 8, 7, 6, 5, 4};
        CustomArray customArray = new CustomArray(ints);
        System.out.println(Arrays.toString(customArray.getInts()));
        CustomArraySorter customArraySorter = new CustomArraySorter();
        customArraySorter.bubbleSort(customArray);
        System.out.println(Arrays.toString(customArray.getInts()));
    }
}
