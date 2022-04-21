package uz.epam.arraytask.util;

import uz.epam.arraytask.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreator {
    public List<CustomArray> customArrayList(List<int[]> numbers) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] ints : numbers) {
            customArrayList.add(new CustomArray(ints));
        }
        return customArrayList;
    }
}
