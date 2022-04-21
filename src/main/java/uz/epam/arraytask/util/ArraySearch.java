package uz.epam.arraytask.util;

import uz.epam.arraytask.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class ArraySearch {
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

    public int findMax(CustomArray customArray) {
        int[] ints = customArray.getInts();
        int max = 0;
        for (int element : ints) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(CustomArray customArray) {
        int[] ints = customArray.getInts();
        int min = 0;
        for (int element : ints) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public List<Integer> findAllPrimeNumbers(CustomArray customArray) {
        List<Integer> primeNumbersList = new ArrayList<>();
        int[] ints = customArray.getInts();
        for (int element : ints) {
            for (int j = 2; j < element; j++) {
                if (element % j == 0) {
                    primeNumbersList.add(element);
                    break;
                }
            }
        }
        return primeNumbersList;
    }
}
