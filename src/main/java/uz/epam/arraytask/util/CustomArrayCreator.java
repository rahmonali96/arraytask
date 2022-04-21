package uz.epam.arraytask.util;

import uz.epam.arraytask.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomArrayCreator {
    public List<CustomArray> customArrayList(List<int[]> numbers) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] ints : numbers) {
            customArrayList.add(new CustomArray(ints));
        }
        return customArrayList;
    }

    public CustomArray createCustomArray(int size) {
        Random random = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        return new CustomArray(ints);
    }
}
