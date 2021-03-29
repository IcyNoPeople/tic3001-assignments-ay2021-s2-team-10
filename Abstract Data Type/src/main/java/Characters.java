package main.java;

import java.util.ArrayList;

public class Characters {

    private static ArrayList<String> line = new ArrayList<>();

    public void setChar(String characters){
        line.add(characters);
    }

    public String getWord(int i){
        return line.get(i);
    }

    public int getSize(){
        return line.size();
    }



}
