package uz.epam.arraytask;

import uz.epam.arraytask.entity.CustomArray;
import uz.epam.arraytask.util.ArraySearch;
import uz.epam.arraytask.util.ArraySorter;
import uz.epam.arraytask.util.DataReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {8,18};
//        CustomArray customArray = new CustomArray(ints);
//        System.out.println(Arrays.toString(customArray.getInts()));
//        ArraySorter customArraySorter = new ArraySorter();
//        customArraySorter.bubbleSort(customArray);
//        System.out.println(Arrays.toString(customArray.getInts()));
//        ArraySearch search = new ArraySearch();
//        System.out.println(search.findAllPrimeNumbers(customArray));
        DataReader dataReader = new DataReader();
        dataReader.getDataFromFile("array.txt");
    }
}
