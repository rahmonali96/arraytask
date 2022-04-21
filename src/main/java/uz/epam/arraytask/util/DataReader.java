package uz.epam.arraytask.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private static final String BASE_PATH = "src\\main\\resources\\data";
    public List<String> getDataFromFile(String path){
        Path filePath = Path.of(BASE_PATH).resolve(path);
        File file = filePath.toFile();
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
