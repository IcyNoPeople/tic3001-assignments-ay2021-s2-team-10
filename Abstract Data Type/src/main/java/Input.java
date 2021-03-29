package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private static String filePath;

    Input(String filePath){
        this.filePath = filePath;
    }

    public static Characters load() throws FileNotFoundException {
        Characters lineItem = new Characters();
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            String line = s.nextLine();
            lineItem.setChar(line);
        }

        return lineItem;
    }






}
