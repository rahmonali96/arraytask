package uz.epam.arraytask;

import uz.epam.arraytask.service.CustomArrayCreator;
import uz.epam.arraytask.util.*;

import java.util.List;

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
        List<String> list =  dataReader.getDataFromFile("array.txt");
        DataParser parser = new DataParser();
        System.out.println(parser.parseList(list));
        CustomArrayCreator customArrayCreator = new CustomArrayCreator();
        System.out.println(customArrayCreator.customArrayList(parser.parseList(list)));
    }
}
