package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
    protected boolean read(String path, List<String> characters) {
        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                characters.add(line);
            }
            reader.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
            return false;
        }
    }
}
