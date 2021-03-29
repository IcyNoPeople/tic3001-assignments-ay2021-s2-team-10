package main;

import java.util.*;

public class CircularShift {
    protected boolean shift(List<String> characters, List<Integer> index) {
        int size = characters.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            index.add(count);
            count++;
            String current = characters.get(i);
            ArrayList<String> line = new ArrayList<>(Arrays.asList(current.split(" ")));
            for (int j = 0; j < current.split(" ").length - 1; j++) {
                line.add(line.remove(0));
                characters.add(String.join(" ", line));
                index.add(count);
                count++;
            }
        }
        return true;
    }
}
