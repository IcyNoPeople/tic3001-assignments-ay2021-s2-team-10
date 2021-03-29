package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class CircularShift {


    private static ArrayList<String> line = new ArrayList<>();


    public void setup(Characters characters){
        int size = characters.getSize();
        for(int i = 0; i < size; i++){
            String manyWords = characters.getWord(i);
            setChar(manyWords);
            ArrayList<String> words = new ArrayList<>(Arrays.asList(manyWords.split(" ")));
            for (int j = 0; j < words.size() - 1; j++) {
                words.add(words.remove(0));
                setChar(String.join(" ", words));
            }
        }
    }

    private void setChar(String line){
        CircularShift.line.add(line);
    }

    public String getWord(int i){
        return line.get(i);
    }

    public char getChar(int i, int j){
        return line.get(i).charAt(j);
    }

    public int getSize(){
        return line.size();
    }


}
