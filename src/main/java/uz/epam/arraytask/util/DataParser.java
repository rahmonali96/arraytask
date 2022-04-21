package uz.epam.arraytask.util;

import uz.epam.arraytask.validator.NumberValidator;

import java.util.List;
import java.util.stream.Collectors;

public class DataParser {
    public List<int[]> parseList(List<String> lines) {
        NumberValidator validator = new NumberValidator();
        return lines.stream().map(s -> s.split(",")).filter(strings -> {
            boolean hasNonNumber = true;
            for (String s : strings) {
                if (!validator.isNumber(s)) {
                    hasNonNumber = false;
                }
            }
            return hasNonNumber;
        }).map(strings -> {
            int length = strings.length;
            int[] ints = new int[length];
            for (int i = 0; i < length; i++) {
                ints[i] =Integer.parseInt(strings[i]);
            }
            return ints;
        }).collect(Collectors.toList());
    }
}
