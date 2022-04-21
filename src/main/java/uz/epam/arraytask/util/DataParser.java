package uz.epam.arraytask.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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
        }).map(strings -> String.join("", strings))
                .map(s -> s.chars().toArray())
                .collect(Collectors.toList());
    }
}
