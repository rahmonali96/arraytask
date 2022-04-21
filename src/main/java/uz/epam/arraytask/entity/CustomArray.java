package uz.epam.arraytask.entity;

import uz.epam.arraytask.exception.ArraySizeException;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {
    private int[] ints;

    public CustomArray() {
    }

    public CustomArray(int size) {
        if (size > 0) {
            ints = new int[size];
        }else {
            throw new ArraySizeException("Size of array must be greater than zero");
        }

    }

    public CustomArray(int[] ints) {
        this.ints = ints;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(ints, that.ints);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ints);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("ints=" + Arrays.toString(ints))
                .toString();
    }
}
